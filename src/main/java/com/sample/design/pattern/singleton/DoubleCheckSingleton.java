package com.sample.design.pattern.singleton;

/**
 * 双重校验, 线程不安全
 * 
 * 1.A、B线程同时进入了第一个if判断
 * 2.A首先进入synchronized块，由于instance为null，所以它执行instance = new Singleton();
 * 3.然后线程A执行1-> JVM先画出了一些分配给Singleton实例的空白内存，并赋值给instance
 * 4.在还没有进行第三步（将instance引用指向内存空间）的时候，线程A离开了synchronized块
 * 5.线程B进入synchronized块，读取到了A线程返回的instance，此时这个instance并未进行物理地址指向，是一个空对象。
 *
 */
public class DoubleCheckSingleton {
	
	private volatile static DoubleCheckSingleton instance;
	
	private DoubleCheckSingleton() {}
	
	public static DoubleCheckSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}

}
