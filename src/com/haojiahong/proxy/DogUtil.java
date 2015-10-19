package com.haojiahong.proxy;

/**
 * 这两个方法将会作为切面切入到dog接口中的两个方法中
 * 
 * @author haojiahong
 * 
 * @createtime：2015-10-19 下午1:40:06
 * 
 * 
 */
public class DogUtil {
	public void method1() {
		System.out.println("===模拟第一个通用方法===");
	}

	public void method2() {
		System.out.println("===模拟第二个通用方法===");
	}
}
