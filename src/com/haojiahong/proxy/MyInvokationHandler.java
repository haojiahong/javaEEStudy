package com.haojiahong.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvokationHandler implements InvocationHandler {

	// 需要被代理的对象
	private Object target;

	public void setTarget(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		DogUtil du = new DogUtil();
		du.method1();
		// 以target作为主调来执行method方法
		Object result = method.invoke(target, args);
		du.method2();
		return result;
	}

}
