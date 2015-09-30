package com.ram.home;

public class RecursivePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(getPower(5,3));
		
		System.out.println(getPowerR(5,3));
		System.out.println(getPowerR(2,8));
	}
	
	public static int getPower(int x, int y) {
		if (y == 1) {
			return x;
		} else {
			return getPower(x*x, y/2);
		}
	}
	
	public static int getPowerR(int x, int y) {
		if (y == 1) {
			return x;
		} else {
			return x * getPowerR(x, y-1);
		} 
	}

}
