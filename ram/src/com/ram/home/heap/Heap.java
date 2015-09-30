package com.ram.home.heap;

public class Heap {
	
	//n * log(n)
	
	private Node[] heapArray;
	private int maxSize;
	private int currentSize;
	
	public Heap(int mx) {
		maxSize = mx;
		heapArray = new Node[maxSize];
		currentSize = 0;
	}
	
	public boolean isEmpty() {
		return (currentSize == 0);
	}
	
	public boolean insert(int key) {
		/*
		 * Insertion uses trickle up.
		 */
		
		if (currentSize == maxSize) {
			return false;
		}
		
		Node newNode = new Node(key);
		heapArray[currentSize] = newNode;
		trickleUp(currentSize++);
		return true;
	}
	
	public void trickleUp(int index) {
		int parent = (index -1) /2;
		Node bottom = heapArray[index];
		
		while (index > 0 && heapArray[parent].getKey() < bottom.getKey()) {
			heapArray[index] = heapArray[parent];
			index = parent;
			parent = (parent -1)/2;
		}
		
		heapArray[index] = bottom;
		
		
	}
	
	public void trickleDown(int index) {
		int largerChild;
		Node top = heapArray[index];
		
		while (index < currentSize/2) {
			int leftChild = 2 * index + 1;
			int rightChild = leftChild + 2;
			
			if (rightChild < currentSize && heapArray[rightChild].getKey() > heapArray[leftChild].getKey()) {
				largerChild = rightChild;
			} else {
				largerChild = leftChild;
			}
			
			if (top.getKey() >= heapArray[largerChild].getKey()) {
				break;
			}
			
			heapArray[index] = heapArray[largerChild];
			index = largerChild;
			
		}
		
		heapArray[index] = top;
		
	}
	
	public Node remove() {
		//Removal means removing the node with the maximum key
		/*
		 * steps for removing the maximum node:
			1. Remove the root.
			2. Move the last node into the root.
			3. Trickle the last node down until it’s below a larger node and above a
			   smaller one
		 * 
		 */
		Node root = heapArray[0];
		heapArray[0] = heapArray[--currentSize];
		trickleDown(0);
		return root;
		
	}
	
	public boolean change(int index, int newValue) {
		
		if (index < 0 || index >= currentSize) {
			return false;
		}
		int oldValue = heapArray[index].getKey();
		heapArray[index].setKey(newValue);
		
		if (oldValue < newValue) {
			trickleUp(index);
		} else {
			trickleDown(index);
		}
		
		return true;
	}
	
	public void displayHeap() {
		System.out.print("heapArray: "); // array format
		for(int m=0; m<currentSize; m++)
		if(heapArray[m] != null)
		System.out.print( heapArray[m].getKey() + " ");
		else
		System.out.print( "-- ");
		System.out.println();
	}

}
