package com.ram.home;

public class AsciiDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "abcxyzABCXYZ{[";
		
		for (int i=0;i<test.length();i++) {
			char c = test.charAt(i);
			System.out.println(c + " -> " + (int)c);
		}
		
		System.out.println(triangle(6));

	}
	
	public static int triangle(int n) {
		if (n == 1) {
			return n;
		}
		else {
			return (n + triangle(n-1));
		}
	}
	
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * factorial(n-1));
		}
	}

}
