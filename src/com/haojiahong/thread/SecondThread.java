package com.haojiahong.thread;

public class SecondThread implements Runnable {

	private int i;

	@Override
	public void run() {
		for (; i < 100; i++) {
			// ���߳���ʵ��Runnable�ӿ�ʱ��������ȡ��ǰ�̣߳�ֻ����Thread.currentThread()����
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			SecondThread st = new SecondThread();
			if (i == 20) {
				new Thread(st, "���߳�1").start();
				new Thread(st, "���߳�2").start();
			}
			if (i == 40) {

			}

		}
	}
}
