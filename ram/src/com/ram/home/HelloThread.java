package com.ram.home;

public class HelloThread extends Thread{
	
	public void run() {
		System.out.println("i am a hello thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HelloThread().start();
	}

}
