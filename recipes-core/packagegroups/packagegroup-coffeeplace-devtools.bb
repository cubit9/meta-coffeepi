DESCRIPTION = "Tools for target device during Coffeeplace development"
LICENSE = "MIT"
PR = "r0"

inherit packagegroup

RDEPENDS_${PN} = "\
    openssh-sftp-server \
    rsync \
"

