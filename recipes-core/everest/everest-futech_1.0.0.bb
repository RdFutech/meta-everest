LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/PionixInternal/everest-futech.git;protocol=ssh;user=git;branch=bookworm_wip"

# tag 1.0.0
SRCREV = "b2cb634457ab4ff279728809ae9b2835a403bb4b"

S = "${WORKDIR}/git"

do_configure[network] = "1"

DEPENDS = "basecamp-futech"

inherit cmake
