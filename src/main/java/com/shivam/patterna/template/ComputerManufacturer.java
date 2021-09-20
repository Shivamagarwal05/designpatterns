package com.shivam.patterna.template;

public abstract class ComputerManufacturer {

    public void buildComputer() {
        addHardDisk();
        addKeyboard();
        addRam();
    }

    protected abstract void addHardDisk();

    protected abstract void addRam();

    protected abstract void addKeyboard();
}
