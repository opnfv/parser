#!/bin/bash -e
##############################################################################
# Copyright (c) 2016 ZTE Corporation.
#
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Apache License, Version 2.0
# which accompanies this distribution, and is available at
# http://www.apache.org/licenses/LICENSE-2.0
##############################################################################

PARSER_CI_DEBUG=${CI_DEBUG:-true}
[[ "${PARSER_CI_DEBUG}" == "true" ]] && set -x

PARSER_IMAGE_URL_FILE=cirros-0.3.0-x86_64-disk.img
PARSER_IMAGE_URL=https://launchpad.net/cirros/trunk/0.3.0/+download/${PARSER_IMAGE_URL_FILE}
PARSER_IMAGE_NAME=rhel-6.5-test-image
PARSER_IMAGE_FILE="${PARSER_IMAGE_NAME}.img"
PARSER_IMAGE_FORMAT=qcow2

PARSER_VM_FLAVOR=m1.tiny

PARSER_USER=parser
PARSER_PASSWORD=parser
PARSER_PROJECT=parser
PARSER_TENANT=${PARSER_PROJECT}

PARSER_ROLE=admin

PARSER_STACK_NAME=vRNC_Stack

# VRNC_INPUT_TEMPLATE_FILE=../tosca2heat/tosca-parser/toscaparser/extensions/nfv/tests/data/vRNC/Definitions/vRNC.yaml
VRNC_INPUT_TEMPLATE_FILE=../tosca2heat/heat-translator/translator/tests/data/test_tosca_nfv_sample.yaml

VRNC_OUTPUT_TEMPLATE_FILE=./vRNC_Hot_Template.yaml

download_parser_image() {
    [ -e "${PARSER_IMAGE_URL_FILE}" ] && {
        echo "Image ${PARSER_IMAGE_URL_FILE} has bee cached, needn't download again."
        cp ${PARSER_IMAGE_URL_FILE} ${PARSER_IMAGE_FILE}
        return 0
    }

    echo "Download image ${PARSER_IMAGE_URL_FILE}..."
    wget "${PARSER_IMAGE_URL}" -o "${PARSER_IMAGE_FILE}"
}

register_parser_image() {
    openstack image list | grep -qwo "${PARSER_IMAGE_NAME}" && {
        echo "Image ${PARSER_IMAGE_NAME} has bee registed, needn't registe again."
        return 0
    }

    echo "Registe image ${PARSER_IMAGE_NAME}..."
    openstack image create "${PARSER_IMAGE_NAME}" \
                           --public \
                           --disk-format "${PARSER_IMAGE_FORMAT}" \
                           --container-format bare \
                           --file "${PARSER_IMAGE_FILE}"
}

create_parser_user_and_project() {

    # 1. create parser user.
    openstack user list | grep -qwo "${PARSER_USER}" && {
        echo "User ${PARSER_USER} exist, doesn't create again."
    } || {
        openstack user create "${PARSER_USER}" --password "${PARSER_PASSWORD}"
        echo "Create user ${PARSER_USER} successful."
    }

    # 2. create parser project
    openstack project list | grep -qwo "${PARSER_PROJECT}" && {
        echo "Project ${PARSER_PROJECT} exist, doesn't create agian."
    } || {
        openstack project create "${PARSER_PROJECT}"
        echo "Create project ${PARSER_PROJECT} successful."
    }

    # 3. grant role for parser user
    openstack user role list "${PARSER_USER}" --project "${PARSER_PROJECT}" \
    | grep -qow " ${PARSER_ROLE}" && {
        echo "User ${PARSER_USER} has role ${PARSER_ROLE} in project ${PARSER_PROJECT}, doesn't create."
    } || {
        openstack role add "${PARSER_ROLE}" --user "${PARSER_USER}" \
                           --project "${PARSER_PROJECT}"
        echo "Grant user ${PARSER_USER} the role ${PARSER_ROLE} in project ${PARSER_PROJECT} successful."
    }

}

change_env_to_parser_user_project() {

    export OS_USERNAME="$PARSER_USER"
    export OS_PASSWORD="$PARSER_PASSWORD"
    export OS_PROJECT_NAME="$PARSER_PROJECT"
    export OS_TENANT_NAME="$PARSER_TENANT"

}

translator_and_deploy_vRNC() {
    (
        # 1. Delete parser stack ${PARSER_STACK_NAME}, use admin user in admin project
        openstack stack list | grep -qow ${PARSER_STACK_NAME} && {
            echo "stack ${PARSER_STACK_NAME} exist, delete it first."
            openstack stack delete --yes --wait ${PARSER_STACK_NAME}
        }
        # 2. Switch env to parser project temporally
        change_env_to_parser_user_project

        # 3. Translator and deploy vRNC
        heat-translator --template-type tosca --template-file ${VRNC_INPUT_TEMPLATE_FILE} \
            --output-file ${VRNC_OUTPUT_TEMPLATE_FILE}

        # 4. deploy vRNC
        openstack stack create -t ${VRNC_OUTPUT_TEMPLATE_FILE} ${PARSER_STACK_NAME}

        # 5. Wait for create vRNC
        sleep 60

        # 6. Validate the deploy result.

    )

}

reset_parser_test() {
    set +e

    echo "cleanup..."
    # 1. Delete resource created by parser user
    (
        # 1). Switch env to parser project temporally
        change_env_to_parser_user_project

        # 2). Delete the stack ${PARSER_STACK_NAME}
        openstack stack list | grep -qow ${PARSER_STACK_NAME} && {
            echo "stack ${PARSER_STACK_NAME} has been created, delete it after test."
            openstack stack delete --yes --wait ${PARSER_STACK_NAME}
        }

        # 3). Delete hot tmp file ${VRNC_OUTPUT_TEMPLATE_FILE}
        [ -e ${VRNC_OUTPUT_TEMPLATE_FILE} -a ${CI_DEBUG} != "true" ] && {
            echo "delete hot temp file ${VRNC_OUTPUT_TEMPLATE_FILE} after test."
            rm -fr ${VRNC_OUTPUT_TEMPLATE_FILE}
        }

        # 4). Delete tmp image ${PARSER_IMAGE_FILE}
        [[ -e ${PARSER_IMAGE_FILE} ]] && {
            echo "delete local image file ${PARSER_IMAGE_FILE} after test."
            rm -fr ${PARSER_IMAGE_FILE}
        }

        # 5). Delete tmp image ${PARSER_IMAGE_URL_FILE}
        [ -e ${PARSER_IMAGE_URL_FILE} -a ${CI_DEBUG} != "true" ] && {
            echo "delete local URL image file ${PARSER_IMAGE_URL_FILE} after test."
            rm -fr ${PARSER_IMAGE_URL_FILE}
        }

        # 6). Delete image from openstack
        parser_image_id=$(openstack image list | grep -w "${PARSER_IMAGE_NAME}" | awk '{print $2}')
        [[ -n "${parser_image_id}" ]] && openstack image delete "${parser_image_id}"

        sleep 3
    )

    # 2. Delete role, user and project
    openstack user role list "${PARSER_USER}" --project "${PARSER_PROJECT}" \
    | grep -qow " ${PARSER_ROLE}" && {
        openstack role remove "${PARSER_ROLE}" --user "${PARSER_USER}" \
                              --project "${PARSER_PROJECT}"
    }

    openstack project list | grep -qwo "${PARSER_PROJECT}" && {
        openstack project delete "${PARSER_PROJECT}"
    }

    openstack user list | grep -qow "${PARSER_USER}" && {
        openstack user delete "${PARSER_USER}"
    }

}


echo "======================= Parser functest begin =========================="

trap reset_parser_test EXIT

echo " ========= 1/4. Preparing VM image for parser...     ========= "
download_parser_image
register_parser_image

echo " ========= 2/4. Creating test user for parser...     ========= "
create_parser_user_and_project

echo " ========= 3/4. Parse -> translate -> deploy vRNC... ========= "
translator_and_deploy_vRNC

echo " ========= 4/4. Test ok...                           ========= "

echo "======================= Parser functest end =========================="
