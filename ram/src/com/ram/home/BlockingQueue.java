package com.ram.home;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {
	private List queue = new LinkedList();
	private int limit = 10;
	
	public BlockingQueue(int size) {
		this.limit = size;
	}
	
	public synchronized void enqueue(Object item) throws InterruptedException {
		while (this.queue.size() == this.limit) {
			wait();
		}
		
		if (this.queue.isEmpty()) {
			notifyAll();
		}
		this.queue.add(item);
	}
	
	public synchronized Object dequeue() throws InterruptedException {
		while (this.queue.size() == 0) {
			wait();
		}
		if (this.queue.size() == this.limit) {
			notifyAll();
		}
		return this.queue.remove(0);
		
	}

}
