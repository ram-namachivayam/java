package com.ram.home;

public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        permutate("","abc"); 
	}
	
	public static void permutate(String prefix, String str) {
		
		int n = str.length();
		
		if (str.length() <= 1 ) {
			System.out.println( prefix + str);
		} else {
			for (int i=0;i<n;i++) {
				String temp = str.substring(0, i) + str.substring(i+1, n);
				//System.out.println("temp " + temp);
				permutate( (prefix + str.charAt(i)), temp);
			}
		}
		
	}

}
