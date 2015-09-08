package com.tyaathome.VirtualFactory;

/**
 * 产品A的工厂
 * @author tyaathome
 *
 */
public class FactoryA implements InterfaceFactory {

	@Override
	public A create() {
		System.out.println("FactoryA create A instance!");
		return new A();
	}
}
