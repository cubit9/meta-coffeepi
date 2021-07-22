# Enable audio subsystem in kernel and load kernel modules for sound (snd_*)
# at boot time. Loading sound modules through /etc/modules is too late such
# that sound doesn't work.

# for Raspberry Pi 1 and Zero
#do_deploy_append() {
#    echo "# Enable audio (loads snd_bcm2835)" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
#    echo "dtparam=audio=on" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
#}

# Raspberry Pi 4B
do_deploy_append() {
    echo "# Enable audio (loads snd_bcm2711)" >> ${DEPLOYDIR}/bcm2711-bootfiles/config.txt
    echo "dtparam=audio=on" >> ${DEPLOYDIR}/bcm2711-bootfiles/config.txt
}