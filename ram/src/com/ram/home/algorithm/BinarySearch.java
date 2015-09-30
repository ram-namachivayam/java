package com.ram.home.algorithm;

/*
 * Uses Ordered Array
 * 
 */

public class BinarySearch {

	private static int[] testArray = {2,4,7,8,9,12,23,29};
	
	public static void main(String[] args) {
		System.out.println(find(30));
	}
	
	public static boolean find(int searchKey) {
		int lowBound = 0;
		int upperBound = testArray.length - 1;
		int pivot;
		
		while(true) {
			pivot = (lowBound + upperBound)/2;
			
			if (testArray[pivot] ==  searchKey) {
				return true;
			}
			
			else if (lowBound > upperBound) {
				return false;
			}
			
			else {
				if (testArray[pivot] < searchKey) {
					lowBound = pivot + 1;
				}
				else {
					upperBound = pivot -1;
				}
			}		
			
		}
	}
}
