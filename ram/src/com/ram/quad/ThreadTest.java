package com.ram.quad;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyRunnable());
		t1.setName("t1");
		Thread t2 = new Thread(new MyRunnable());
		t2.setName("t2");
		
		t1.start();
		t2.start();
	}

}
