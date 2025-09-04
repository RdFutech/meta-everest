LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/RdFutech/basecamp-futech.git;protocol=ssh;user=git;branch=bookworm_wip"

# tag 0.0.1
SRCREV = "b2cb634457ab4ff279728809ae9b2835a403bb4b"

S = "${WORKDIR}/git"

DEPENDS = "everest-core"

inherit cmake
