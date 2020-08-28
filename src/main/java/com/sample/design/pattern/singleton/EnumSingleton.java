package com.sample.design.pattern.singleton;

/**
 * 枚举单例
 *
 */
public class EnumSingleton {

	private EnumSingleton() {}
	
	static enum Singleton {
		// 创建一个枚举对象，该对象天生为单例
		INSTANCE;
		private EnumSingleton singleton;
		
		private Singleton() {
			singleton = new EnumSingleton();
		}
		
		public EnumSingleton getInstance() {
			return singleton;
		}
	}
	
	public static EnumSingleton getInstance() {
		return Singleton.INSTANCE.getInstance();
	}
}
