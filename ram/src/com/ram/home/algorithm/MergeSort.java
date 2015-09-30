package com.ram.home.algorithm;

public class MergeSort {
	
	private static int[] finalArray = {2,7,35,98,13,19,32,66,97};
	
	public MergeSort() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//displaySortedArray(mergeSortedArrays());
		displaySortedArray(finalArray);
		recursiveMergeSort(finalArray, 0, finalArray.length-1);
		displaySortedArray(finalArray);
	}
	
	public static void recursiveMergeSort(int[] inArray, int lowBound, int upBound) {
		if (lowBound == upBound) {
			return;
			
		} else {
			int midPoint = (lowBound + upBound)/2;
			
			recursiveMergeSort(inArray, lowBound, midPoint);
			
			recursiveMergeSort(inArray, midPoint + 1, upBound);
			
			merge1(inArray, lowBound, midPoint + 1, upBound);
			
		}
		
	}
	
	public static void merge(int[] tempArray, int lowPoint, int highPoint, int upBound) {
		int j = 0;
		int lowBound = lowPoint;
		int mid = highPoint - 1;
		int n = upBound - lowBound + 1;
		
		while (lowPoint <= mid && highPoint <= upBound) {
			if (finalArray[lowPoint] < finalArray[highPoint]) {
				tempArray[j++] = finalArray[lowPoint++];
			} else {
				tempArray[j++] = finalArray[highPoint++];
			}
		}
		
		while (lowPoint <= mid) {
			tempArray[j++] = finalArray[lowPoint++];
		}
		
		while (highPoint <= upBound) {
			tempArray[j++] = finalArray[highPoint++];
		}
		
		for (j=0;j<n;j++) {
			finalArray[lowBound + j] = tempArray[j];
		}
	}
	
	private static void merge1(int[] tempArray, int lowPtr,
			int highPtr, int upperBound)
	{
		int j = 0; // workspace index
		int lowerBound = lowPtr;
		int mid = highPtr-1;
		int n = upperBound-lowerBound+1; // # of items
		while(lowPtr <= mid && highPtr <= upperBound)
			if( finalArray[lowPtr] < finalArray[highPtr] )
				tempArray[j++] = finalArray[lowPtr++];
			else
				tempArray[j++] = finalArray[highPtr++];
		while(lowPtr <= mid)
			tempArray[j++] = finalArray[lowPtr++];
		while(highPtr <= upperBound)
			tempArray[j++] = finalArray[highPtr++];
		for(j=0; j<n; j++)
			finalArray[lowerBound+j] = tempArray[j];
	} // end merge
	
	public static int[] mergeSortedArrays() {
		int[] arrayA = {2,7,35,98};
		int[] arrayB = {13,19,32,66,97};
		
		int sizeA = arrayA.length;
		int sizeB = arrayB.length;
		
		int[] arrayC = new int[sizeA + sizeB];
		
		int aDex = 0;
		int bDex = 0;
		int cDex = 0;
		
		while (aDex < sizeA && bDex < sizeB) {
			if (arrayA[aDex] < arrayB[bDex]) {
				arrayC[cDex++] = arrayA[aDex++];
			} else {
				arrayC[cDex++] = arrayB[bDex++];
			}
		}
		
		while (aDex < sizeA) {
			arrayC[cDex++] = arrayA[aDex++];
		}
		
		while (bDex < sizeB) {
			arrayC[cDex++] = arrayB[bDex++];
		}
		
		return arrayC;
	}
	
	public static void displaySortedArray(int[] displayArray) {
		for (int i=0;i< displayArray.length;i++) {
			System.out.print(displayArray[i] + " ");
		}
		System.out.println("");
	}

}
