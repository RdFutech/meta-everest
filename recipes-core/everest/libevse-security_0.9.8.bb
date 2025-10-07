LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/EVerest/libevse-security.git;branch=main;protocol=https \
           "

inherit cmake

S = "${WORKDIR}/git"

<<<<<<<< HEAD:recipes-core/everest/libevse-security_0.9.7.bb
SRCREV = "9f246bcca44ffe18212e919273bce281e07f3d7f"
========
SRCREV = "7f60d4fe37c8caa166780872b39331d7bfd914db"
>>>>>>>> scarthgap-futech:recipes-core/everest/libevse-security_0.9.8.bb

DEPENDS = "\
    date \
    everest-cmake \
    liblog \
    libtimer \
    openssl \
"

FILES:${PN} += "${datadir}/everest/*"

EXTRA_OECMAKE += "-DDISABLE_EDM=ON -DEVSE_SECURITY_INSTALL=ON -DLIBEVSE_SECURITY_BUILD_TESTING=OFF"
OECMAKE_CXX_FLAGS += "-Wno-narrowing"
