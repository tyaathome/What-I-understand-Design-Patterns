package com.tyaathome.singleton;

/**
 * 单例模式
 * @author tyaathome
 *
 */
public class Singleton {

	private static Singleton instance = null;

	private Singleton() {
		System.out.println("create instance!");
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void doSth() {
		System.out.println("Hello!");
	}

}
