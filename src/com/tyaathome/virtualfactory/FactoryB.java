package com.tyaathome.virtualfactory;

/**
 * 产品B的工厂
 * @author tyaathome
 *
 */
public class FactoryB implements InterfaceFactory {

	@Override
	public B create() {
		System.out.println("FactoryB create B instance!");
		return new B();
	}

}
