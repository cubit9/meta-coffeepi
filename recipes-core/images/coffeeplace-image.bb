DESCRIPTION = "Fairly minimal image for coffeeplace app"
LICENSE = "MIT"

inherit core-image

# Old
#DEPENDS += "bcm2835-bootfiles"

# New
DEPENDS += "bcm2835"

IMAGE_FEATURES += "\
    splash \
    ssh-server-dropbear \
    debug-tweaks \
"

IMAGE_INSTALL += " \
    packagegroup-coffeeplace-devtools \
    packagegroup-qml-basic \
    packagegroup-qml-multimedia \
    coffeeplace \
"

# Add an extra 0.5 GB of free space to the root filesystem
IMAGE_ROOTFS_EXTRA_SPACE = "524288"

