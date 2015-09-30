package com.ram.home.algorithm;

public class RecursiveBinarySearch {
	
	private static int[] testArray = new int[10];
	//private static int[] testArray = {2,4,7,8,9,12,23,29};
	private static int nElems;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insert(29);
		insert(23);
		insert(12);
		insert(9);
		insert(8);
		insert(4);
		insert(7);
		insert(2);
		System.out.println(find(9, 0, 7));
	}
	
//	public static void insert(int value) // put element into array
//	{
//		int j;
//		for(j=0; j<testArray.length; j++) // find where it goes
//			if(testArray[j] > value) // (linear search)
//				break;
//		for(int k=testArray.length; k>j; k--) // move bigger ones up
//			testArray[k] = testArray[k-1];
//		testArray[j] = value; // insert it
//		nElems++; // increment size
//	} //
	
	public static void insert(int newValue) {
		int j;
		
		for (j=0;j<testArray.length;j++) {
			
			if (testArray[j] > newValue) {
				break;
			}			
		}
		
		for (int k=testArray.length;k>j;k--) {
			testArray[k] = testArray[k-1];
		}
		testArray[j] = newValue;
		
	}
	
	public static boolean find(int searchKey, int lowBound, int upBound) {
		int curIn;
		curIn = (lowBound + upBound)/2;
		if (testArray[curIn] == searchKey) {
			return true;
		}
		else if (lowBound > upBound) {
			return false;
		}
		else {
			if (testArray[curIn] < searchKey) {
				return find(searchKey, curIn+1, upBound);
			} else {
				return find(searchKey, lowBound, curIn-1);
			}
		}
		
		
	}

}
