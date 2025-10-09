LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/PionixInternal/everest-futech.git;protocol=ssh;user=git;branch=scarthgap_wip"

# tag 1.0.0
SRCREV = "002be59171a09c3b42d9ed0e23a6503cc4969829"

do_compile[network] = "1"

S = "${WORKDIR}/git"

DEPENDS = " \
    basecamp-futech \
    evcli-native \
"
inherit pkgconfig

# oe-pkgdata-util find-path '*/gpio.hpp'
CXXFLAGS:append = " -I${STAGING_INCDIR}/everest/gpio/include -Wno-psabi"
CFLAGS:append   = " -Wno-psabi"

FILES:${PN} += "${datadir}/everest/* /usr/firmware /usr/firmware/* "

EXTRA_OECMAKE += " \
    -DDISABLE_EDM=ON \
    -Deverest-core_INSTALL_EV_CLI_IN_PYTHON_VENV=OFF \
    -Deverest-core_USE_PYTHON_VENV=OFF \
    -DEV_SETUP_PYTHON_EXECUTABLE_USE_PYTHON_VENV=OFF \
    -DCMAKE_SKIP_RPATH=ON \
    -DCMAKE_BUILD_WITH_INSTALL_RPATH=OFF \
    -DCMAKE_SKIP_INSTALL_RPATH=ON \
    -DCMAKE_INSTALL_RPATH='' \
"

inherit cmake

do_install:append() {
    rm -f ${D}${datadir}/everest/version_information.txt
}
