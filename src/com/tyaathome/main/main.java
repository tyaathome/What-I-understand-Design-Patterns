package com.tyaathome.main;

import com.tyaathome.adapter.Adapter;
import com.tyaathome.adapter.Adapter2;
import com.tyaathome.adapter.Adapter3;
import com.tyaathome.singleton.Singleton;
import com.tyaathome.virtualfactory.FactoryA;
import com.tyaathome.virtualfactory.FactoryB;
import com.tyaathome.virtualfactory.InterfaceFactory;
import com.tyaathome.virtualfactory.Product;

public class main {

	public static void main(String[] args) {
		VirtualFactoryTest();
		SingletonTest();
		AdapterTest();
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
	
	private static void create(InterfaceFactory factory) {
		Product a = factory.create();
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
	
	private static void AdapterTest() {
		System.out.println("------------------------Adapter------------------------");
		Adapter a1 = new Adapter();
		Adapter2 a2 = new Adapter2();
		Adapter3 a3 = new Adapter3();
		a1.doSth();
		a1.doSth2();
		a1.doSth3();
		a2.doSth();
		a2.doSth2();
		a2.doSth3();
		a3.doSth();
		a3.doSth2();
		a3.doSth3();
		System.out.println("-------------------------------------------------------");
	}
	
	/*-------------------------------------------------------*/

}
