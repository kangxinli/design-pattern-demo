package com.sample.design.pattern.singleton;

/**
 * 懒汉, 线程安全
 *
 */
public class LazySingleton {
	
	private static LazySingleton instance;
	
	private LazySingleton() {}
	
	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

}
