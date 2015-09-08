package com.tyaathome.VirtualFactory;
public class FactoryB implements interfaceFactory {

	@Override
	public B create() {
		System.out.println("FactoryB create B instance!");
		return new B();
	}

}
