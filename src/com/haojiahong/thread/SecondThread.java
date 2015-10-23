package com.haojiahong.thread;

public class SecondThread implements Runnable {

	private int i;

	@Override
	public void run() {
		for (; i < 100; i++) {
			// 当线程类实现Runnable接口时，如果想获取当前线程，只能用Thread.currentThread()方法
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			SecondThread st = new SecondThread();
			if (i == 20) {
				new Thread(st, "新线程1").start();
				new Thread(st, "新线程2").start();
			}
			if (i == 40) {

			}

		}
	}
}
