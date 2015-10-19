package com.haojiahong.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvokationHandler implements InvocationHandler {

	// ��Ҫ������Ķ���
	private Object target;

	public void setTarget(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		DogUtil du = new DogUtil();
		du.method1();
		// ��target��Ϊ������ִ��method����
		Object result = method.invoke(target, args);
		du.method2();
		return result;
	}

}
