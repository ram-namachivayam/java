package com.ram.home;

public class FibonacciTest {
	public static void main(String[] args) {

		FibonacciTest fibonacciTest = new FibonacciTest();
		int fibLength = 10;
		long[] fibSeries = fibonacciTest.produceFibonacciSequence(fibLength);

//		for (int i = 0; i < fibLength; i++) {
//			System.out.println(fibSeries[i] + " ");
//		}
		
		for (int i = 0; i < fibLength; i++) {
			System.out.println("Fibonacci sequence for " + i + " is " + fibonacciTest.recursiveFibonacciSequence(i) + " ");
		}
	}

	public long[] produceFibonacciSequence(int n) {

		long[] series = new long[n];

		series[0] = 0;
		series[1] = 1;
		for (int i = 2; i < n; i++) {
			series[i] = series[i - 1] + series[i - 2];
		}

		return series;
	}
	
	public int recursiveFibonacciSequence(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return recursiveFibonacciSequence(n-1) + recursiveFibonacciSequence(n-2);
		}
	}
}
