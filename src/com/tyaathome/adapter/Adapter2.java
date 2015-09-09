package com.tyaathome.adapter;

/**
 * 实现Source中doSth2方法的适配器
 * @author tyaathome
 *
 */
public class Adapter2 extends Wrapper{

	@Override
	public void doSth2() {
		super.doSth2();
		System.out.println("I'm Adapter2!");
	}
	
}
