package com.ram.home.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallableTest {
	
	/*
	 * 
	 * 
	 */
	
	

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(5);
		
		List<Future> futureList = new ArrayList<Future>();
		
		for (int i=0;i<10;i++) {
			Future<String> future = service.submit(new MyCallable());
			futureList.add(future);
		}
		
		for (Future f: futureList) {
			try {
				System.out.println(f.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		service.shutdown();
		
	}
	

}

class MyCallable implements Callable{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		
		return (Thread.currentThread().getName());
	}

}
