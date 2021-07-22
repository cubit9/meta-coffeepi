SUMMARY = "CoffeePlace - Simple App for showing QML and Qt on embedded systems"
AUTHOR = "Cubit9 Technologies Ltd. (info@cubit9.com)"
HOMEPAGE = "https://www.cubit9.com"

SECTION = "app"

LICENSE = "MIT"
LIC_FILES_CHKSUM="file://LICENSE;md5=c15db29e010df44a3c3b8fd440adf991"

inherit cmake_qt5 update-rc.d

SRC_URI = "\
    git://github.com/cubit9/coffeeplace.git;branch=master;protocol=https \
    file://coffeeplace \
"
SRCREV = "4f9f029931b48e7a722e38f1d93f71c0500845c1"

PV = "1.0+git${SRCREV}"

DEPENDS = "qtmultimedia"

INITSCRIPT_NAME = "coffeeplace"
INITSCRIPT_PARAMS = "defaults 70"

S = "${WORKDIR}/git"

do_install_append() {
  install -d ${D}${sysconfdir}/init.d/
  install -m 0755 ${WORKDIR}/coffeeplace ${D}${sysconfdir}/init.d/coffeeplace
}


FILES_${PN} += "/usr/local/bin/${PN}"
