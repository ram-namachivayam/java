package com.ram.home.string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseString rs = new ReverseString();
		System.out.println(rs.reverseString("priya"));

	}
	
	public String reverseString(String str) {
		
		String reverse = "";
		
		if (str.length() == 1) return str;
		else {
			reverse += str.charAt(str.length() -1) + reverseString(str.substring(0, str.length()-1));
		}
		
		return reverse;
	}

}
