package com.haojiahong.proxy;

/**
 * 测试类(模拟aop成功)
 * 
 * @author haojiahong
 * 
 * @createtime：2015-10-19 下午1:52:46
 * 
 * 
 */
public class Test {
	public static void main(String[] args) {
		// 创建一个原始的gunDog对象，作为target
		Dog target = new GunDog();
		// 以指定的target来创建动态代理对象
		Dog dog = (Dog) MyProxyFactory.getProxy(target);
		dog.info();
		dog.run();
	}
}
