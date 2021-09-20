package com.shivam.patterna.template;

public class LaptopManufacturer extends ComputerManufacturer {
    @Override
    protected void addHardDisk() {
        System.out.println("Adding Hard disk to Laptop");
    }

    @Override
    protected void addRam() {
        System.out.println("Adding RAM to Laptop");
    }

    @Override
    protected void addKeyboard() {
        System.out.println("Adding Keyboard to Laptop");
    }
}
