package com.haojiahong.proxy;

/**
 * ������(ģ��aop�ɹ�)
 * 
 * @author haojiahong
 * 
 * @createtime��2015-10-19 ����1:52:46
 * 
 * 
 */
public class Test {
	public static void main(String[] args) {
		// ����һ��ԭʼ��gunDog������Ϊtarget
		Dog target = new GunDog();
		// ��ָ����target��������̬�������
		Dog dog = (Dog) MyProxyFactory.getProxy(target);
		dog.info();
		dog.run();
	}
}
