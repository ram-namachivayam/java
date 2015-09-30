package com.ram.home.general;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray = {2,14,6,23,5,91};
		
		int max = 0, secondMax = 0;
		
		if (testArray[0] > testArray[1]) {
			 max = testArray[0];
			 secondMax = testArray[1];
		}
		
		for (int i=2;i<testArray.length;i++) {
			if (testArray[i] > max) {
				secondMax = max;
				max = testArray[i];
			}
			else if (testArray[i] > secondMax) {
				secondMax = testArray[i];
			}
		}
		
		System.out.println(max + " - " + secondMax);

	}

}
