package com.sample.design.pattern.proxy.dynamicproxy;

public class Student implements Person {
	
	private String name;
	
	Student(String name) {
		this.name = name;
	}

	@Override
	public void giveMoney() {
		try {
          //假设数钱花了一秒时间
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println(name + "上交班费50元");
	}

}
