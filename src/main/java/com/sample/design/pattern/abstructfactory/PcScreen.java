package com.sample.design.pattern.abstructfactory;

public class PcScreen implements Screen {
    @Override
    public void dpi() {
        System.out.println("1024*768");
    }
}
