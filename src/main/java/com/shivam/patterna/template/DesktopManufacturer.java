package com.shivam.patterna.template;

public class DesktopManufacturer extends ComputerManufacturer {
    @Override
    protected void addHardDisk() {
        System.out.println("Adding Hard disk to Desktop");
    }

    @Override
    protected void addRam() {
        System.out.println("Adding RAM to Desktop");
    }

    @Override
    protected void addKeyboard() {
        System.out.println("Adding Keyboard to Desktop");
    }
}
