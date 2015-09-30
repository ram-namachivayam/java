package com.ram.home.algorithm;

public class BubbleSort {
	
	private long[] a;
	private int elements;
	
	public BubbleSort(int max) {
		a = new long[max];
		elements = 0;
	}
	
	public void insert(long val) {
		a[elements] = val;
		elements ++;
	}
	
	public void bubbleSort() {
		int out;
		int in;
		
		for (out = elements-1; out>1; out--) {
			for (in = 0;in<out;in++) {
				if (a[in] > a[in+1]) {
					swap(in, in+1);
				}
			}
			
		}
	}
	
	public void swap(int firstVale, int secondVal) {
		long temp = a[firstVale];
		a[firstVale] = a[secondVal];
		a[secondVal] = temp;
	}
	
	public void display() {
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort bs = new BubbleSort(8);
		bs.insert(33);
		bs.insert(13);
		bs.insert(23);
		bs.insert(93);
		bs.insert(43);
		bs.insert(63);
		bs.insert(73);
		bs.insert(53);
		
		bs.display();
		bs.bubbleSort();
		bs.display();
	}

}
