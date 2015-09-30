package com.ram.home.general;

import com.ram.home.Node;

public class QueueNode {
	
	private final int SIZE = 20;
	private Node[] queArray;
	private int front;
	private int rear;
	
	public QueueNode() {
		queArray = new Node[SIZE];
		front = 0;
		rear = -1;
	}
	
	// put item at rear of queue
	public void insert(Node i) {
		if (rear == SIZE -1) {
			rear = -1;
		}
		queArray[++rear] = i;
	}
	
	public Node remove() {
		Node temp = queArray[front++];
		if (front == SIZE) {
			front = 0;
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return (rear + 1 == front || front + SIZE-1 == rear);
	}

}
