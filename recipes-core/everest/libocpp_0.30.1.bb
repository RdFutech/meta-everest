LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/EVerest/libocpp.git;branch=main;protocol=https \
           "

inherit cmake

S = "${WORKDIR}/git"

<<<<<<<< HEAD:recipes-core/everest/libocpp_0.30.0.bb
SRCREV = "9c8ec21f15a404b27438accc4fe006cfcd6accbe"
========
SRCREV = "157ba65d9487c149dcd0ed31179a738c4b5ca343"
>>>>>>>> scarthgap-futech:recipes-core/everest/libocpp_0.30.1.bb

DEPENDS = "\
    everest-cmake \
    boost \
    sqlite3 \
    openssl \
    libwebsockets \
    nlohmann-json \
    json-schema-validator \
    libfsm \
    liblog \
    libtimer \
    libevse-security \
    everest-sqlite \
"

FILES:${PN} += "${datadir}/everest/*"

EXTRA_OECMAKE += "-DDISABLE_EDM=ON"
