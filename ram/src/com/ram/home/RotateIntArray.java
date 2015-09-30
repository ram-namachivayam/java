package com.ram.home;

public class RotateIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {1,2,3,4,5,6};
		
		display(input);
		
		int k = 2;
		
		for (int i=0;i<k;i++) {
			for (int j=input.length-1;j>0;j--) {
				int temp = input[j];
				input[j] = input[j-1];
				input[j-1] = temp;
			}
		}
		
		display(input);
		
//		for (int i=0;i<k;i++) {
//			int temp = input[i];
//			int from = i;
//			//int to = input.length -1 - i;
//			int to = input.length - k + i ;
////			System.out.println(from + " " + to);
////			System.out.println(input[i] + " " + input[to] + " " + temp);
//			input[i] = input[to];
//			input[to] = temp;
//		}
//		
//		//display(input);
//		
//		int v = k;
//		
//		for (int m=0;m<=k;m++) {
//			int t = input[m];
//			input[m] = input[v+m];
//			input[v+m] = t;
//			k--;
//		}
//		
//		display(input);

	}
	
	public static void display(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println();
	}

}
