package com.sample.design.pattern.abstructfactory;

public class PhoneFactory implements ElectronicFactory {

    @Override
    public CPU createCpu() {
        return new Pcpu();
    }

    @Override
    public GraphicsProcessor createG() {
        return new PhoneG();
    }

    @Override
    public Screen createScreen() {
        return new PhoneScreen();
    }
}
