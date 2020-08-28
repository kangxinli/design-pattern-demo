package com.sample.design.pattern.factorymethod;

public class XiaoMiFactory implements PhoneFactory {

    @Override
    public Phone createPhone() {
        return new XiaoMi();
    }
}
