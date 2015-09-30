package com.ram.home;

public class FindDuplicateIntInArray {
	
	static int[] a = {1,2,4,5,6,9,7,19,20};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findDuplicate());
	}
	
	public static boolean findDuplicate() {
		for (int i=1;i<a.length;i++) {
			if (a[i-1] == a[i]) {
				return true;
			}
//			for (int j=1;j<a.length;j++) {
//				if (a[i] == a[j]) {
//					return true;
//				}
//			}
		}
		return false;
	}

}
