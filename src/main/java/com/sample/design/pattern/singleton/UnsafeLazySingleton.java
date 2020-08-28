package com.sample.design.pattern.singleton;

/**
 * 懒汉, 线程不安全
 *
 */
public class UnsafeLazySingleton {
	
	private static UnsafeLazySingleton instance;
	
	private UnsafeLazySingleton() {}
	
	public static UnsafeLazySingleton getInstance() {
		if (instance == null) {
			instance = new UnsafeLazySingleton();
		}
		return instance;
	}

}
