package com.ram.home.linear;

public class FindKthLargestElementsinArray {
	
	/*
	 * Write an efficient program for printing k largest elements in an array. 
	 * Elements in array can be in any order.

		For example, if given array is [1, 23, 12, 9, 30, 2, 50] and you are asked 
		for the largest 3 elements i.e., k = 3 then your program should 
		print 50, 30 and 23.
	 */
	
	//private static int[] dArray = {1, 23, 12, 9, 30, 2, 50};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] dArray = {1, 23, 12, 9, 30, 2, 50};
		findLargestKthElements(3);
		System.out.println("\n" + "Using Binary");
		bubbleSort(3);
	}
	
	public static void findLargestKthElements(int k) {
		/*
		 *  Method 2 (Use temporary array)
			K largest elements from arr[0..n-1]

			1) Store the first k elements in a temporary array temp[0..k-1].
			2) Find the smallest element in temp[], let the smallest element be min.
			3) For each element x in arr[k] to arr[n-1]
			If x is greater than the min then remove min from temp[] and insert x.
			4) Print final k elements of temp[]
			
			Time Complexity: O((n-k)*k). If we want the output sorted then O((n-k)*k + klogk)
		 * 
		 */
		int[] dArray = {1, 23, 12, 9, 30, 2, 50};
		print(dArray);
		
		int[] tempArray = new int[k];
		
		for (int i=0;i<k;i++) {
			tempArray[i] = dArray[i];
		}
		
		print(tempArray);
				
		int min = 0;
		int minIndex = 0;
		minIndex = getMinIndex(tempArray);
		min = tempArray[minIndex];
		
		for (int j=k;j<dArray.length;j++) {
			System.out.println(" Orig " + dArray[j] + " " + min);
			if (dArray[j] > min) {
				
				tempArray[minIndex] = dArray[j];
				
				print(tempArray);
				
				minIndex = getMinIndex(tempArray);
				min = tempArray[minIndex];
				System.out.println(min + " - " + minIndex);
			}
		}
		
		print(tempArray);
		
	}
	
	public static int getMinIndex(int[] tempArray) {
		int min = tempArray[0];
		
		int minIndex = 0;
		for (int i=0;i<tempArray.length;i++) {
			if (min > tempArray[i]) {
				min = tempArray[i];
				minIndex = i;
			}
		}
		
		return minIndex;
	}
	
	//finding using BubbleSort
	
	public static void bubbleSort(int k) {
		int[] dArray = {1, 23, 12, 9, 30, 2, 50};
		print(dArray);
		int in;
		int out;
		
		for (out = dArray.length - 1;out > k;out-- ) {
			for (in=0;in<out;in++) {
				if (dArray[in] > dArray[in+1]) {
					swap(in, in+1, dArray);
				}
			}
		}
		
		print(dArray);
	}
	
	public static void swap(int in, int out, int[] dArray) {
		int temp = dArray[in];
		dArray[in] = dArray[out];
		dArray[out] = temp;
	}
	
	public static void print(int[] tempArray) {
		for (int m=0;m<tempArray.length;m++) {
			System.out.print(tempArray[m] + " ");
		}
		System.out.println();
	}

}
