package com.tyaathome.VirtualFactory;

/**
 * ��ƷB�Ĺ���
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
