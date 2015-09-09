package com.tyaathome.adapter;

/**
 * 包装抽象类
 * @author tyaathome
 *
 */
public abstract class Wrapper implements Source{

	@Override
	public void doSth() {
		//System.out.println("I'm Wrapper 1!");
	}
	
	@Override
	public void doSth2() {
		//System.out.println("I'm Wrapper 2!");
	}

	@Override
	public void doSth3() {
		//System.out.println("I'm Wrapper 3!");
	}
	
}
