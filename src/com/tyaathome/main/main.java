package com.tyaathome.main;

import com.tyaathome.Singleton.Singleton;
import com.tyaathome.VirtualFactory.FactoryA;
import com.tyaathome.VirtualFactory.FactoryB;
import com.tyaathome.VirtualFactory.instance;
import com.tyaathome.VirtualFactory.interfaceFactory;

public class main {

	public static void main(String[] args) {
		VirtualFactoryTest();
		SingletonTest();
	}
	
	/**
	 * 抽象工厂模式示例
	 */
	private static void VirtualFactoryTest() {
		System.out.println("-----------------------VirtualFfactory-----------------");
		create(new FactoryA());
		create(new FactoryB());
		System.out.println("-------------------------------------------------------");
	}
	
	private static void create(interfaceFactory factory) {
		instance a = factory.create();
		a.doSth();
	}
	
	/*-------------------------------------------------------*/
	
	/**
	 * 单例模式示例
	 */
	private static void SingletonTest() {
		System.out.println("------------------------Singleton----------------------");
		Singleton.getInstance().doSth();
		System.out.println("-------------------------------------------------------");
	}
	
	/*-------------------------------------------------------*/

}
