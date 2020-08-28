package com.sample.design.pattern.factorymethod;

public class HuaWeiFactory implements PhoneFactory{

    @Override
    public Phone createPhone() {
        return new HuanWei();
    }
}
