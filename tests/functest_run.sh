#!/bin/bash -e
##############################################################################
# Copyright (c) 2016 ZTE Corporation.
#
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Apache License, Version 2.0
# which accompanies this distribution, and is available at
# http://www.apache.org/licenses/LICENSE-2.0
##############################################################################

PARSER_CI_DEBUG=${CI_DEBUG:-false}
PRASER_WORK_DIR=$(cd $(dirname $0) && pwd)

[[ "${PARSER_CI_DEBUG}" == "true" ]] && {
    set -x
    debug="--debug"
} || {
    set +x
    debug=""
}
LOCAL_IMAGE_FILE=${1:-""}

# Install parser
echo "Prepare parser ..."
${PRASER_WORK_DIR}/parser_install.sh ${PRASER_WORK_DIR}/../..
echo "Prepare result: $?"

if [ -e "${LOCAL_IMAGE_FILE}" ]; then
    echo "Input local image file: ${LOCAL_IMAGE_FILE}"
    PARSER_IMAGE_URL_FILE=${LOCAL_IMAGE_FILE}
else
    echo "No input local image file or the file(${LOCAL_IMAGE_FILE}) doesn't exsit!"

    PARSER_IMAGE_URL_FILE=cirros-0.3.5-x86_64-disk.img
    PARSER_IMAGE_VERSION=$(echo ${PARSER_IMAGE_URL_FILE} | awk -F- '{print $2}')
    # PARSER_IMAGE_URL=https://launchpad.net/cirros/trunk/0.3.0/+download/${PARSER_IMAGE_URL_FILE}
    PARSER_IMAGE_URL=http://download.cirros-cloud.net/${PARSER_IMAGE_VERSION}/${PARSER_IMAGE_URL_FILE}
    echo "Will download image(${PARSER_IMAGE_URL_FILE}) from ${PARSER_IMAGE_URL}."
fi

# PARSER_IMAGE_NAME=rhel-6.5-test-image
# fiexd image name according to the translator default vlaue of images
PARSER_IMAGE_NAME=cirros-0.3.2-x86_64-uec
PARSER_IMAGE_FILE="${PARSER_IMAGE_NAME}.img"
PARSER_IMAGE_FORMAT=qcow2

PARSER_USER=parser
PARSER_PASSWORD=parser
PARSER_EMAIL='shang.xiaodong@zte.com.cn'
PARSER_PROJECT=parser
PARSER_TENANT=${PARSER_PROJECT}

PARSER_ROLE=admin

PARSER_STACK_NAME=vRNC_Stack

# VRNC_INPUT_TEMPLATE_FILE=../tosca2heat/tosca-parser/toscaparser/extensions/nfv/tests/data/vRNC/Definitions/vRNC.yaml
# VRNC_INPUT_TEMPLATE_RAW_FILE=../tosca2heat/heat-translator/translator/tests/data/test_tosca_nfv_sample.yaml
VRNC_INPUT_TEMPLATE_RAW_FILE=../tosca2heat/heat-translator/translator/tests/data/vRNC/Definitions/vRNC.yaml
VRNC_OUTPUT_TEMPLATE_FILE=../tosca2heat/heat-translator/translator/tests/data/vRNC/vRNC_Hot_Template.yaml

VRNC_INPUT_TEMPLATE_FILE=${VRNC_INPUT_TEMPLATE_RAW_FILE%.*}_patch.yaml

download_parser_image() {
    [ -e "${PARSER_IMAGE_URL_FILE}" ] && {
        echo "  Image ${PARSER_IMAGE_URL_FILE} has bee cached, needn't download again."
        cp ${PARSER_IMAGE_URL_FILE} ${PARSER_IMAGE_FILE}
        return 0
    }

    echo ""
    echo "  Download image ${PARSER_IMAGE_URL_FILE}..."
    wget ${PARSER_IMAGE_URL} -o ${PARSER_IMAGE_FILE}
}

register_parser_image() {
    openstack ${debug} image list | grep -qwo "${PARSER_IMAGE_NAME}" && {
        echo "  Image ${PARSER_IMAGE_NAME} has bee registed, needn't registe again."
        return 0
    }

    echo ""
    echo "  Registe image ${PARSER_IMAGE_NAME}..."
    openstack ${debug} image create "${PARSER_IMAGE_NAME}" \
                           --public \
                           --disk-format ${PARSER_IMAGE_FORMAT} \
                           --container-format bare \
                           --file ${PARSER_IMAGE_FILE}
}

create_parser_user_and_project() {

    # 1. create parser project
    openstack ${debug} project list | grep -qwo "${PARSER_PROJECT}" && {
        echo "  Project ${PARSER_PROJECT} exist, doesn't create agian."
    } || {
        openstack  ${debug} project create ${PARSER_PROJECT} \
            --description "Project for parser test"
        echo "  Create project ${PARSER_PROJECT} successful."
    }

    # 2. create parser user.
    openstack ${debug} user list | grep -qwo ${PARSER_USER} && {
        echo "  User ${PARSER_USER} exist, doesn't create again."
    } || {
        openstack ${debug} user create ${PARSER_USER} --password ${PARSER_PASSWORD} \
            --project ${PARSER_PROJECT} --email ${PARSER_EMAIL}
        echo "  Create user ${PARSER_USER} successful."
    }

    # 3. grant role for parser user
    openstack ${debug} user role list ${PARSER_USER} --project ${PARSER_PROJECT} \
    | grep -qow ${PARSER_ROLE} && {
        echo "  User ${PARSER_USER} has role ${PARSER_ROLE} in project ${PARSER_PROJECT}, doesn't create."
    } || {
        openstack ${debug} role add ${PARSER_ROLE} --user ${PARSER_USER} \
                           --project ${PARSER_PROJECT}
        echo "  Grant user ${PARSER_USER} the role ${PARSER_ROLE} in project ${PARSER_PROJECT} successful."
    }

}

change_env_to_parser_user_project() {

    export OS_USERNAME=${PARSER_USER}
    export OS_PASSWORD=${PARSER_PASSWORD}
    export OS_PROJECT_NAME=${PARSER_PROJECT}
    export OS_TENANT_NAME=${PARSER_TENANT}

    export OS_PROJECT_DOMAIN_NAME=${OS_PROJECT_DOMAIN_NAME:-'Default'}
    export OS_USER_DOMAIN_NAME=${OS_USER_DOMAIN_NAME:-'Default'}

}


make_patch_for_provider_network() {

    # copy temp file
    echo "    Patch provider network for input file:"
    echo "      Raw yaml file: ${VRNC_INPUT_TEMPLATE_RAW_FILE}"
    echo "      Patched yaml file: ${VRNC_INPUT_TEMPLATE_FILE}"
    cp ${VRNC_INPUT_TEMPLATE_RAW_FILE} ${VRNC_INPUT_TEMPLATE_FILE}
    echo ""

    # Delete the provider:network_type
    echo "      Patching provider:network_type..."
    sed -i '/network_type:/d' ${VRNC_INPUT_TEMPLATE_FILE}

    # Delete the provider:segmentation_id
    echo "      Patching provider:segmentation_id..."
    sed -i '/segmentation_id:/d' ${VRNC_INPUT_TEMPLATE_FILE}

    # Delete the provider:physical_network
    echo "      Patching provider:physical_network..."
    sed -i '/physical_network:/d' ${VRNC_INPUT_TEMPLATE_FILE}

    echo ""

}

make_patch_for_translated_file() {

    # Replace the signal_transport
    echo "    Patch yaml file: ${VRNC_OUTPUT_TEMPLATE_FILE}"
    echo ""
    echo "    Patching compute:signal_transport"
    sed -i '1,$s/HEAT_SIGNAL/NO_SIGNAL/g' ${VRNC_OUTPUT_TEMPLATE_FILE}

}


translator_and_deploy_vRNC() {

    (
        # 1. Delete parser stack ${PARSER_STACK_NAME}, use admin user in admin project
        openstack ${debug} stack list | grep -qow ${PARSER_STACK_NAME} && {
            echo "  Stack ${PARSER_STACK_NAME} exist, delete it first."
            openstack stack delete --yes --wait ${PARSER_STACK_NAME}
        }
        # 2. Switch env to parser project temporally
        echo "  Switch openstack env to parser project"
        change_env_to_parser_user_project
        echo ""

        # 3. Patch provider network
        echo "  Make patch for provider network"
        make_patch_for_provider_network

        # 4. Translator yaml
        echo "  Translator use parser:"
        echo "    1. Input  file: ${VRNC_INPUT_TEMPLATE_FILE}"
        echo "    2. Output file: ${VRNC_OUTPUT_TEMPLATE_FILE}"
        heat-translator --template-type tosca --template-file ${VRNC_INPUT_TEMPLATE_FILE} \
            --output-file ${VRNC_OUTPUT_TEMPLATE_FILE}
        echo ""

        # 5. Patch translated file
        echo "  Make patch for translated file:"
        make_patch_for_translated_file
        echo ""

        # 6. deploy vRNC
        echo "  Deploy stack..."
        [[ "${PARSER_CI_DEBUG}" == "true" ]] && debug="--debug" || debug=""
        openstack ${debug} stack create --timeout 15 --wait --enable-rollback \
                                        -t ${VRNC_OUTPUT_TEMPLATE_FILE} ${PARSER_STACK_NAME}

        # 7. basic information.
        echo "  The basic information of deployment..."
        openstack ${debug} stack show ${PARSER_STACK_NAME}

        # 8. deployed resources.
        echo "  The resources of deployment..."
        openstack ${debug} stack resource list ${PARSER_STACK_NAME}

        # 9. deployed outputs.
        echo "  The outputs of deployment..."
        openstack ${debug} stack output list ${PARSER_STACK_NAME}

        # 10. Validate the deploy result.
        echo "  Checking the result of deployment..."
        openstack ${debug} stack show ${PARSER_STACK_NAME} | grep -qow "CREATE_COMPLETE" && {
            echo "    Check the result of deployment successfully."
        } || {
            echo "    Check the result of deployment unsuccessfully."
        }
    )

}

reset_parser_test() {

    set +e

    echo "  Clean-up the environment..."
    # 1. Delete resource created by parser user
    (
        # 1). Switch env to parser project temporally
        change_env_to_parser_user_project

        # 2). Delete the stack ${PARSER_STACK_NAME}
        echo ""
        openstack ${debug} stack list | grep -qow ${PARSER_STACK_NAME} && {
            echo "    Stack ${PARSER_STACK_NAME} has been created, delete it after test."
            echo ""
            openstack ${debug} stack delete --yes --wait ${PARSER_STACK_NAME}
            echo ""
        }

        # 3). Delete patch tmp file ${VRNC_INPUT_TEMPLATE_FILE}
        [ -e ${VRNC_OUTPUT_TEMPLATE_FILE} -a ${PARSER_CI_DEBUG} != "true" ] && {
            echo "    Delete patch temp file ${VRNC_INPUT_TEMPLATE_FILE} after test."
            rm -fr ${VRNC_INPUT_TEMPLATE_FILE}
        }

        # 4). Delete hot tmp file ${VRNC_OUTPUT_TEMPLATE_FILE}
        [ -e ${VRNC_OUTPUT_TEMPLATE_FILE} -a ${PARSER_CI_DEBUG} != "true" ] && {
            echo "    Delete hot temp file ${VRNC_OUTPUT_TEMPLATE_FILE} after test."
            rm -fr ${VRNC_OUTPUT_TEMPLATE_FILE}
        }

        # 5). Delete tmp image ${PARSER_IMAGE_FILE}
        [[ -e ${PARSER_IMAGE_FILE} ]] && {
            echo "    Delete local image file ${PARSER_IMAGE_FILE} after test."
            rm -fr ${PARSER_IMAGE_FILE}
        }

        # 6). Delete tmp image ${PARSER_IMAGE_URL_FILE}
        [ -e ${PARSER_IMAGE_URL_FILE} -a ${PARSER_CI_DEBUG} != "true" ] && {
            echo "    Delete local URL image file ${PARSER_IMAGE_URL_FILE} after test."
            rm -fr ${PARSER_IMAGE_URL_FILE}
        }

        # 7). Delete image from openstack
        parser_image_id=$(openstack ${debug} image list | grep -w "${PARSER_IMAGE_NAME}" | awk '{print $2}')
        [[ -n "${parser_image_id}" ]] && openstack image delete "${parser_image_id}"

        sleep 3
    )

    # 2. Delete role, user and project
    echo "    Delete user ${PARSER_USER}'s role from project ${PARSER_PROJECT}"
    openstack ${debug} user role list "${PARSER_USER}" --project "${PARSER_PROJECT}" \
    | grep -qow "${PARSER_ROLE}" && {
        openstack ${debug} role remove "${PARSER_ROLE}" --user "${PARSER_USER}" \
                              --project "${PARSER_PROJECT}"
    }

    echo "    Delete user ${PARSER_USER}"
    openstack ${debug} user list | grep -qow "${PARSER_USER}" && {
        openstack user delete "${PARSER_USER}"
    }

    echo "    Delete project ${PARSER_PROJECT}"
    openstack ${debug} project list | grep -qwo "${PARSER_PROJECT}" && {
        openstack project delete "${PARSER_PROJECT}"
    }

    echo ""
    echo "======================={ Parser functest end }=========================="
    echo ""
    echo ""

}

echo ""
echo ""
echo "======================={ Parser functest begin }=========================="
echo ""

trap reset_parser_test EXIT

# start syslog for loghander
service rsyslog restart

echo "|========= 1/4. Preparing VM image for parser...     =========|"
download_parser_image
register_parser_image

echo ""
echo "|========= 2/4. Creating test user for parser...     =========|"
create_parser_user_and_project

echo ""
echo "|========= 3/4. Parse -> translate -> deploy vRNC... =========|"
translator_and_deploy_vRNC

echo ""
echo "|========= 4/4. Test ok...                           =========|"
echo ""
