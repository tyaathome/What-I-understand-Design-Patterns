package com.tyaathome.VirtualFactory;
public class FactoryA implements interfaceFactory {

	@Override
	public A create() {
		System.out.println("FactoryA create A instance!");
		return new A();
	}
}
