package com.ram.home.algorithm;

public class QuickSort {
	
	private int[] theArray = {14,13,24,54,2,99,234,56};
	
	public QuickSort() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QuickSort qs = new QuickSort();
		
		qs.display();
		qs.recursiveQuickSort(0, qs.theArray.length-1);
		qs.display();

	}
	
	public void display() {
		for (int i=0;i<theArray.length;i++) {
			System.out.print(theArray[i] + " ");
		}
		
		System.out.println("");
	}
	
	public void recursiveQuickSort(int left, int right) {
		
		if (right -left <= 0) {
			return;
			
		} else {
			int pivot = theArray[right];
			
			int partition = partitionIt(left, right, pivot);
			
			recursiveQuickSort(left, partition-1);
			recursiveQuickSort(partition+1, right);
			
		}
	}
	
	public int partitionIt(int left, int right, int pivot) {
		int leftPtr = left -1;
		int rightPtr = right ;
		
		while (true) {
			while (theArray[++leftPtr] < pivot){
				//do nothing
			}
			while (rightPtr > 0 && theArray[--rightPtr] > pivot) {
				//do nothing
			}
			
			if (leftPtr >= rightPtr) {
				break;
			} else {
				//swap
				swap(leftPtr, rightPtr);
			}
		}
		
		swap(leftPtr, right);
		
		return leftPtr;
		
	}
	
	public void swap(int left, int right) {
		int temp = theArray[left];
		theArray[left] = theArray[right];
		theArray[right] = temp;
	}

}
