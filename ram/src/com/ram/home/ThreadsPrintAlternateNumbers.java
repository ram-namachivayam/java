package com.ram.home;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadsPrintAlternateNumbers {
	
	public static Object lock = new Object();
	
	private AtomicInteger count = new AtomicInteger();
	private AtomicBoolean isPrintOk = new AtomicBoolean(Boolean.TRUE);
	private AtomicBoolean doPrint = new AtomicBoolean(Boolean.TRUE);
	
	private static int turn = 0;
	private static int counter = 0;
			
	
	private char[] alphaArray = {'a','b','c','d','e','f','g','h','i','j','k','l'
			,'m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadsPrintAlternateNumbers testPrint = new ThreadsPrintAlternateNumbers();
		Thread t1 = new Thread(testPrint.new TestThread());
		t1.setName("t1");
		t1.setPriority(5);
		Thread t2 = new Thread(testPrint.new TestThread());
		t2.setName("t2");
		t2.setPriority(5);
		t1.start();
		t2.start();
	}
	
	public synchronized void printChar() {

		if (count.intValue() <=25) {

			System.out.print(Thread.currentThread().getName() + " -> " + alphaArray[count.intValue()]);
			System.out.println();

			count.getAndIncrement();

			try {
				wait(1);
				doPrint.getAndSet(false);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			doPrint.getAndSet(true);
			notify();

		} else {
			isPrintOk.set(false);
		}
	}
	
	public class TestThread implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub //
//			while (isPrintOk.get() && doPrint.get()) {
//				printChar();
//			}
			
			while (counter < 26) {
				
				synchronized(lock) {
					
					if (turn == 0) {
						
						System.out.print(Thread.currentThread().getName() + " -> " + alphaArray[counter++]);
						System.out.println();

						count.getAndIncrement();
						doPrint.getAndSet(false);
						turn = 1;
						try {
							lock.wait(1);
							

						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						turn = 0;
						doPrint.getAndSet(true);
						lock.notify();
					}			
				}
			}
			
		}		
		
	}

}
