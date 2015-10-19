package com.haojiahong.proxy;

/**
 * Dog的实现类
 * 
 * @author haojiahong
 * 
 * @createtime：2015-10-19 下午1:37:05
 * 
 * 
 */
public class GunDog implements Dog {

	@Override
	public void info() {
		System.out.println("我是一只猎狗");
	}

	@Override
	public void run() {
		System.out.println("我奔跑迅速");
	}

}
