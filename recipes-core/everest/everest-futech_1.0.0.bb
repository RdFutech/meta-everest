LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/PionixInternal/everest-futech.git;protocol=ssh;user=git;branch=bookworm_wip"

# tag 1.0.0
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

DEPENDS = " \
    basecamp-futech \
    everest-core \
    evcli-native \
"

inherit cmake
