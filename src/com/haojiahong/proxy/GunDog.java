package com.haojiahong.proxy;

/**
 * Dog��ʵ����
 * 
 * @author haojiahong
 * 
 * @createtime��2015-10-19 ����1:37:05
 * 
 * 
 */
public class GunDog implements Dog {

	@Override
	public void info() {
		System.out.println("����һֻ�Թ�");
	}

	@Override
	public void run() {
		System.out.println("�ұ���Ѹ��");
	}

}
