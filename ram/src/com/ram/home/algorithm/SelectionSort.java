package com.ram.home.algorithm;

public class SelectionSort {
	
	private long[] a;
	private int elements;
	
	public SelectionSort(int max) {
		a = new long[max];
		elements = 0;
	}
	
	public void insert(long val) {
		a[elements] = val;
		elements ++;
	}
	
	public void selectionSort() {
		int out;
		int in;
		int min;
		
		for (out=0;out<elements-1;out ++) {
			
			min = out;
			
			for (in = out+1;in<elements;in++) {
				if (a[in] < a[min]) {
					min = in;					
				}
			}
			swap(out, min);	
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
		SelectionSort ss = new SelectionSort(8);
		ss.insert(33);
		ss.insert(13);
		ss.insert(23);
		ss.insert(93);
		ss.insert(43);
		ss.insert(63);
		ss.insert(73);
		ss.insert(53);
		
		ss.display();
		ss.selectionSort();
		ss.display();
		

	}

}
