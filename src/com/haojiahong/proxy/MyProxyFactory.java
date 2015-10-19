package com.haojiahong.proxy;

import java.lang.reflect.Proxy;

/**
 * ������̬�������ʵ���Ĺ���
 * 
 * @author haojiahong
 * 
 * @createtime��2015-10-19 ����1:52:23
 * 
 * 
 */
public class MyProxyFactory {
	public static Object getProxy(Object target) {
		MyInvokationHandler handler = new MyInvokationHandler();
		handler.setTarget(target);
		// ���������ط���һ����̬�������ʵ��
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
	}
}
