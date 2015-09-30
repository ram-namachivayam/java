package com.ram.home.datastructures;

public class StackXX {
	
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public StackXX(int size) {
		maxSize = size;
		stackArray = new long[maxSize];
		top = -1;
	}
	
	public void push(long in) {
		stackArray[++top] = in;
	}
	
	public long pop() {
		return stackArray[top--];
	}
	
	public long peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize -1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackXX ss = new StackXX(6);
		ss.push(3);
		ss.push(7);
		ss.push(8);
		ss.push(12);
		
		while (!ss.isEmpty()) {
			long val = ss.pop();
			System.out.println(val);
		}

	}

}
