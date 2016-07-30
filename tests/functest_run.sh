#!/bin/bash -e
##############################################################################
# Copyright (c) 2016 ZTE Corporation.
#
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Apache License, Version 2.0
# which accompanies this distribution, and is available at
# http://www.apache.org/licenses/LICENSE-2.0
##############################################################################

[[ "${CI_DEBUG:-true}" == "true" ]] && set -x

PARSER_IMAGE_URL_FILE=cirros-0.3.0-x86_64-disk.img
PARSER_IMAGE_URL=https://launchpad.net/cirros/trunk/0.3.0/+download/${PARSER_IMAGE_URL_FILE}
PARSER_IMAGE_NAME=cirros
PARSER_IMAGE_FILE="${PARSER_IMAGE_NAME}.img"
PARSER_IMAGE_FORMAT=qcow2

PARSER_VM_FLAVOR=m1.tiny

PARSER_USER=parser
PARSER_PASSWORD=parser
PARSER_PROJECT=parser
PARSER_TENANT=${PARSER_PROJECT}

PARSER_ROLE=admin

PARSER_STACK_NAME=vRNC_Stack

VRNC_INPUT_TEMPLATE_FILE=../tosca2heat/tosca-parser/toscaparser/extensions/nfv/tests/data/vRNC/Definitions/vRNC.yaml
VRNC_OUTPUT_TEMPLATE_FILE=./vRNC_Hot_Template.yaml

download_parser_image() {
    [ -e "${PARSER_IMAGE_URL_FILE}" ] && cp ${PARSER_IMAGE_URL_FILE} ${PARSER_IMAGE_FILE} && return 0
    wget "${PARSER_IMAGE_URL}" -o "${PARSER_IMAGE_FILE}"
}

register_parser_image() {
    openstack image list | grep -qwo "${PARSER_IMAGE_NAME}" && return 0
    openstack image create "${PARSER_IMAGE_NAME}" \
                           --public \
                           --disk-format "${PARSER_IMAGE_FORMAT}" \
                           --container-format bare \
                           --file "${PARSER_IMAGE_FILE}"
}

create_parser_user_and_project() {

    # 1. create parser user.
    openstack user list | grep -qwo "${PARSER_USER}" && {
        echo "User ${PARSER_USER} exist, doesn't crate."
    } || {
        openstack user create "${PARSER_USER}" --password "${PARSER_PASSWORD}"
        echo "Create user ${PARSER_USER} successful."
    }

    # 2. create parser project
    openstack project list | grep -qwo "${PARSER_PROJECT}" && {
        echo "Project ${PARSER_PROJECT} exist, doesn't crate."
    } || {
        openstack project create "${PARSER_PROJECT}"
        echo "Create project ${PARSER_PROJECT} successful."
    }

    # 3. grant role for parser user
    openstack user role list "${PARSER_USER}" --project "${PARSER_PROJECT}" \
    | grep -qow " ${PARSER_ROLE}" && {
        echo "User ${PARSER_USER} has role ${PARSER_ROLE} in project ${PARSER_PROJECT}, doesn't crate."
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
            openstack stack delete ${PARSER_STACK_NAME}
        }
        # 2. Switch env to parser project temporally
        change_env_to_parser_user_project

        # 3. Translator and deploy vRNC
        heat-translator --template-type tosca -f ${VRNC_INPUT_TEMPLATE_FILE} -o ${VRNC_OUTPUT_TEMPLATE_FILE} --deploy True

        # 4. Wait for create vRNC
        sleep 60

        # 5. Validate the deploy result.

    )

}

reset_parser_test() {
    set +e

    ret=$1

    echo "cleanup..."
    (
        # 1. Switch env to parser project temporally
        change_env_to_parser_user_project

        # 2. Delete the stack ${PARSER_STACK_NAME}
        openstack stack list | grep -qow ${PARSER_STACK_NAME} && {
            echo "stack ${PARSER_STACK_NAME} has been created, delete it after test."
            openstack stack delete ${PARSER_STACK_NAME}
        }

        # 3. Delete hot tmp file ${VRNC_OUTPUT_TEMPLATE_FILE}
        [[ -e ${VRNC_OUTPUT_TEMPLATE_FILE} ]] && {
            echo "delete hot temp file ${VRNC_OUTPUT_TEMPLATE_FILE} after test."
            rm -fr ${VRNC_OUTPUT_TEMPLATE_FILE}
        }

        # 4. Delete tmp image ${PARSER_IMAGE_FILE}
        [[ -e ${PARSER_IMAGE_FILE} ]] && {
            echo "delete local image file ${PARSER_IMAGE_FILE} after tes."
            rm -fr ${PARSER_IMAGE_FILE}
        }

        # 5. Delete tmp image ${PARSER_IMAGE_URL_FILE}
        [[ -e ${PARSER_IMAGE_URL_FILE} ]] && {
            echo "delete local image file ${PARSER_IMAGE_URL_FILE} after tes."
            rm -fr ${PARSER_IMAGE_URL_FILE}
        }

        sleep 3
    )

    # 3. Delete parser user and project
    parser_image_id=$(openstack image list | grep -ow "${PARSER_IMAGE_NAME}" | awk '{print $2}')
    sleep 1
    [ -n "${parser_image_id}" ] && openstack image delete "${parser_image_id}"
    openstack role remove "${PARSER_ROLE}" --user "${PARSER_USER}" \
                              --project "${PARSER_PROJECT}"
    openstack project delete "${PARSER_PROJECT}"
    openstack user delete "${PARSER_USER}"

    if [[ ret != "test_ok" ]]; then
       echo " ========= 4/4. test error, check your env or code. ========= "
       echo "======================= Parser functest end =========================="
       exit 1
    fi
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

echo " ========= 4/4. Test ok, clear the test evn...       ========= "
reset_parser_test "test_ok"

echo "======================= Parser functest end =========================="

exit 0

