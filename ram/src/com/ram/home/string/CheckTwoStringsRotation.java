package com.ram.home.string;

public class CheckTwoStringsRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "stackoverflow";
		String s2 = "tackoverflows";
		
		System.out.println(findIfTwoStringsAreRotated(s1, s2));
		
		s1 = "priya";
		s2 = "riyaa";
		
		System.out.println(findIfTwoStringsAreRotated(s1, s2));

	}
	
	public static boolean findIfTwoStringsAreRotated(String s1, String s2) {
		
		if (s1.length() != s2.length()) return false;
		else {
			if ((s1 + s1).indexOf(s2) != -1) return true;
		}
		return false;		
		
	}

}
