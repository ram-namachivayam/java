package com.ram.home.general;

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberReverse nr = new NumberReverse();
		System.out.println(nr.reverseNumber(1947));

	}
	
	public int reverseNumber(int number) {
		int reverse  = 0;
		
		while (number != 0) {
			reverse = reverse * 10 + (number%10);
			number = number/10;
		}
		return reverse;
	}

}

//415-623-6135
