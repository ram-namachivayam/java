package com.ram.home;

public class FindSumEqualsTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = {2,4,5,6};
		findMatch(in, 10);
		findMatch1(in, 10);
	}
	
	public static void findMatch(int[] input, int target) {
		int i = 0;
		int j = input.length - 1;
		int sum = 0;
		
		while (i < j) {
			sum = input[i] + input[j];
			if (sum == target) {
				System.out.println(input[i] + " - " +  input[j]);
				break;
			} else if (sum < target) {
				i++;
			} else {
				j--;
			}
		}
	}
	
	//Not working
	public static void findMatch1(int[] input, int target) {
		
		int start = 0;
		
		int sum = 0;
		
		int arrayLength = input.length ;
		
		while (start < input.length) {
		
		for (int i= 0;i<arrayLength;i++) {
			sum = input[i] + input[arrayLength-i];
			System.out.println(sum);
			if (sum == target) {
				System.out.println(input[i] + " " + input[i+1]);
			}
		}
		start++;
		}
		
	}

}
