package com.tyaathome.adapter;

/**
 * 实现Source中doSth方法的适配器
 * @author tyaathome
 *
 */
public class Adapter extends Wrapper{

	@Override
	public void doSth() {
		super.doSth();
		System.out.println("I'm Adapter!");
	}
	
}
