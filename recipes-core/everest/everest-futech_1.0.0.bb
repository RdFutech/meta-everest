LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/PionixInternal/everest-futech.git;protocol=ssh;user=git;branch=bookworm_wip"

# tag 1.0.0
SRCREV = "${AUTOREV}"

do_compile[network] = "1"

S = "${WORKDIR}/git"

DEPENDS = " \
    basecamp-futech \
    evcli-native \
"

EXTRA_OECMAKE += " \
    -DDISABLE_EDM=ON \
    -Dbasecamp_INSTALL_EV_CLI_IN_PYTHON_VENV=OFF \
    -Dbasecamp_USE_PYTHON_VENV=OFF \
    -DEV_SETUP_PYTHON_EXECUTABLE_USE_PYTHON_VENV=OFF \
"

inherit cmake
