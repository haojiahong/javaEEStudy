package com.haojiahong.proxy;

import java.lang.reflect.Proxy;

/**
 * 创建动态代理对象实例的工厂
 * 
 * @author haojiahong
 * 
 * @createtime：2015-10-19 下午1:52:23
 * 
 * 
 */
public class MyProxyFactory {
	public static Object getProxy(Object target) {
		MyInvokationHandler handler = new MyInvokationHandler();
		handler.setTarget(target);
		// 创建并返回返回一个动态代理对象实例
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
	}
}
