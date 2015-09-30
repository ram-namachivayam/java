package com.ram.quad;

public class MyRunnable implements Runnable {
	
	public static int counter = 0;
	public static int turn = 0;
	public static Object lock = new Object();
	private char[] alphaArray = {'A','B','C','D','E','F','G','H','I','J','K','L'
			,'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (counter < 26) {
			synchronized(lock) {
				if (turn == 0) {
					System.out.println(Thread.currentThread().getName() + " -> " + alphaArray[counter++]);
					turn = 1;
					try {
						lock.wait(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					turn = 0;
					lock.notify();
				}
			}
		}
		
	}

}
