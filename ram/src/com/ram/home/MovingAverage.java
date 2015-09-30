package com.ram.home;

import java.util.LinkedList;
import java.util.Queue;
public class MovingAverage {
	private final Queue<Double> window = new LinkedList<Double>();
	private final int period;
	private double sum;

	public MovingAverage(int period) {
		assert period > 0 : "Period must be a positive integer";
		this.period = period;
	}

	public void newNum(double num) {
		sum += num;
		window.add(num);
		if (window.size() > period) {
			sum -= window.remove();
		}
	}

	public double getAvg() {
		if (window.isEmpty()) return 0; // technically the average is undefined
		return sum / window.size();
	}

	public static void main(String[] args) {
		//double[] testData = {1,2,3,4,5,5,4,3,2,1};
		double[] testData = {1,2,3,4};
		int[] windowSizes = {3};
		for (int windSize : windowSizes) {
			MovingAverage ma = new MovingAverage(windSize);
			for (double x : testData) {
				ma.newNum(x);
				System.out.println("Next number = " + x + ", SMA = " + ma.getAvg());
			}
			System.out.println();
		}
		
		String key = "zxzx";
		
		int keyHashCode = key.hashCode();
		System.out.println(keyHashCode);
		int hash = hash(keyHashCode);
		System.out.println(hash);
		
		System.out.println(indexFor(hash, 10));
	}
	
	public static int indexFor(int h, int length) {
		return h & (length-1);
	}
	
	static int  hash(int h) {

		h ^= (h >>> 20) ^ (h >>> 12);
		return h ^ (h >>> 7) ^ (h >>> 4);

	}
}