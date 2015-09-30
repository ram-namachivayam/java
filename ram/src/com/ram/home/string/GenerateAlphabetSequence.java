package com.ram.home.string;

import static java.lang.Math.*;

public class GenerateAlphabetSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//I’m looking for a way of generating an alphabetic sequence
		//A, B, C, ..., Z, AA, AB, AC, ..., ZZ.
System.out.println(getString(2));

System.out.println(getString1(2));
	}
	
	public static String getString(int n) {
		int size = (int) floor(log(25 * (n + 1)) / log(26));
		System.out.println("Size is " + size);
		char[] buff = new char[size];
		
		for (int i = buff.length-1; i >= 0 ; i--) {
			n--;
			buff[i] = (char) ('A' + n % 26);
			n /= 26;
		}
		return buff.toString();
	}
	
	private static String getString1(int n) {
	    char[] buf = new char[(int) floor(log(25 * (n + 1)) / log(26))];
	    for (int i = buf.length - 1; i >= 0; i--) {
	        n--;
	        buf[i] = (char) ('A' + n % 26);
	        n /= 26;
	    }
	    return new String(buf);
	}

}
