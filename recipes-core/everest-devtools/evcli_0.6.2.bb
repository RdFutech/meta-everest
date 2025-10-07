LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/EVerest/everest-utils.git;branch=main;protocol=https"

<<<<<<<< HEAD:recipes-core/everest-devtools/evcli_0.6.0.bb
SRCREV = "f1117f9d6a9a2fe29d350dd50ecc727a7101ead1"
========
SRCREV = "4d6b213e74a57bc3b690b753e64decf2a487b6b7"
>>>>>>>> scarthgap-futech:recipes-core/everest-devtools/evcli_0.6.2.bb

S = "${WORKDIR}/git"

SETUPTOOLS_SETUP_PATH = "${S}/ev-dev-tools"

inherit setuptools3

do_configure:prepend() {
cat > ${SETUPTOOLS_SETUP_PATH}/setup.py <<-EOF
from setuptools import setup

setup()
EOF
}

DEPENDS = "python3-pip-native"

RDEPENDS:${PN} = " \
    pip-stringcase \
    python3-jsonschema \
    python3-pyyaml \
    python3-jinja2 \
"

BBCLASSEXTEND = "native"
