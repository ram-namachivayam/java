package com.ram.home;

public class HelloRunnable implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new HelloRunnable()).start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("i am a hello runnable thread");
		
	}

}
