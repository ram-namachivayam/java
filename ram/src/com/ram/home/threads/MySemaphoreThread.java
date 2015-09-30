package com.ram.home.threads;

import java.util.concurrent.Semaphore;

public class MySemaphoreThread extends Thread {
	
	private Semaphore semaphore;
	
	public MySemaphoreThread(Semaphore semaphore) {
		this.semaphore = semaphore;
	}
	
	public void run() {
		try {
			semaphore.acquire();
			System.out.println("Hello " + this.getName());
			
			try {
				sleep(2000);
			} catch(Exception e) {
				
			}
			
		} catch(Exception e) {
			
		} finally {
			semaphore.release();
			System.out.println("Goodbye " + this.getName());
		}
	}

}
