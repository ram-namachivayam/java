package com.ram.home;

public class PrimeNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrimeNumber(23));

	}
	
	public static boolean isPrimeNumber(int num) {
		if (num == 2 || num == 3) {
			return true;
		}
		if (num%2 == 0) {
			return false;
		} 
		
		for (int i=3;i*i<=num;i+=2) {
			System.out.println("i" + i);
				if (num%i == 0) {
					return false;
				}
			}
		return true;
	}

}
