package com.ram.home.linear;

public class SortAlmostSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doSort();
	}
	
	public static void doSort() {
		int[] dArray = {10, 20, 60, 40, 50, 30};
		print(dArray);
		
		for (int i= dArray.length -1; i>0; i--) {
			
			if (dArray[i] < dArray[i-1]) {
				
				int j = i-1;
				
				//System.out.println(i+ " " + j);
				while (j>=0 && dArray[i] < dArray[j]) {
					j--;
					
				}
				//System.out.println(i+ " " + ++j);
				j++;
				swap(i, j, dArray);
				break;
				
			}
		}
		print(dArray);
		
	}
	
	public static void swap(int in, int out, int[] dArray) {
		int temp = dArray[out];
		
		dArray[out] = dArray[in];
		dArray[in] = temp;
	}
	
	public static void print(int[] tempArray) {
		for (int m=0;m<tempArray.length;m++) {
			System.out.print(tempArray[m] + " ");
		}
		System.out.println();
	}

}
