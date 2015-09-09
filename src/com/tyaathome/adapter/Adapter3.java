package com.tyaathome.adapter;

/**
 * 实现Source中doSth3方法的适配器
 * @author tyaathome
 *
 */
public class Adapter3 extends Wrapper{
	
	@Override
	public void doSth3() {
		super.doSth3();
		System.out.println("I'm Adapter3!");
	}
	
}
