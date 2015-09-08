package com.tyaathome.main;

import com.tyaathome.Singleton.Singleton;
import com.tyaathome.VirtualFactory.FactoryA;
import com.tyaathome.VirtualFactory.FactoryB;
import com.tyaathome.VirtualFactory.Product;
import com.tyaathome.VirtualFactory.InterfaceFactory;

public class main {

	public static void main(String[] args) {
		VirtualFactoryTest();
		SingletonTest();
	}
	
	/**
	 * ���󹤳�ģʽʾ��
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
	 * ����ģʽʾ��
	 */
	private static void SingletonTest() {
		System.out.println("------------------------Singleton----------------------");
		Singleton.getInstance().doSth();
		System.out.println("-------------------------------------------------------");
	}
	
	/*-------------------------------------------------------*/

}
