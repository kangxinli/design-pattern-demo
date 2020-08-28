package com.sample.design.pattern.factorymethod;


public class IphoneFactory implements PhoneFactory {

    @Override
    public Phone createPhone() {
        return new Iphone();
    }
}
