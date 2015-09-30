package com.ram.home.threads;

public class Payroll {
	public static void main(String[] args) {

		new Payroll().process();

	}

	public void process() {
		WorkerThread wt = new WorkerThread();
		wt.start();
		
		try {
			wt.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("Total is: " + wt.total);
	}

	private class WorkerThread extends Thread {
		int total = 0;

		public void run() {
			for (int i = 0; i < 100; i++)
				total += i;
		}
	}
}
