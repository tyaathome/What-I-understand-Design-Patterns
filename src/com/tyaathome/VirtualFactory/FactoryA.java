package com.tyaathome.VirtualFactory;

/**
 * ��ƷA�Ĺ���
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
