package com.ram.home.linear;

public class FindLargestPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findLargestSum());
	}
	
	public static int findLargestSum() {
		int first;
		int second;
		
		int[] dArray = {12, 34, 10, 6, 40};
		
		if (dArray[0] > dArray[1]) {
			first = dArray[0];
			second = dArray[1];
		} else {
			first = dArray[1];
			second = dArray[0];
		}
		
		for (int i=2; i< dArray.length; i++) {
			
			if (dArray[i] > first) {
				second = first;
				first = dArray[i];
				
			} else if (dArray[i] > second && dArray[i] != first) {
				second = dArray[i];
			}
		}
		
		return first + second;
	}

}
