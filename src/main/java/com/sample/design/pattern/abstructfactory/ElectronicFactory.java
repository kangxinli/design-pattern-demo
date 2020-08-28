package com.sample.design.pattern.abstructfactory;

public interface ElectronicFactory {
    CPU createCpu();
    GraphicsProcessor createG();
    Screen createScreen();
}
