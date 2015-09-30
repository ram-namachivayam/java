package com.ram.home.threads;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semaphore semaphore = new Semaphore(2);
		
		MySemaphoreThread mst1 = new MySemaphoreThread(semaphore);
		MySemaphoreThread mst2 = new MySemaphoreThread(semaphore);
		MySemaphoreThread mst3 = new MySemaphoreThread(semaphore);
		MySemaphoreThread mst4 = new MySemaphoreThread(semaphore);
		
		mst1.start();
		mst2.start();
		mst3.start();
		mst4.start();

	}

}
