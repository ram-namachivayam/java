package com.ram.home.heap;

public class HeapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Heap theHeap = new Heap(10);
		
		theHeap.insert(70); // insert 10 items
		theHeap.insert(40);
		theHeap.insert(50);
		theHeap.insert(20);
		theHeap.insert(60);
		theHeap.insert(100);
		theHeap.insert(80);
		theHeap.insert(30);
		theHeap.insert(10);
		theHeap.insert(90);
		
		theHeap.displayHeap();

	}

}
