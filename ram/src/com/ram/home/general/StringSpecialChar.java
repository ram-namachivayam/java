package com.ram.home.general;

import java.util.regex.Pattern;

public class StringSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "abcdefˆ";
		String s = "welcome";
		//Pattern p = Pattern.compile("[^a-zA-Z0-9]");
		Pattern p = Pattern.compile("[^a-zA-Z]");
		boolean hasSpecialChar = p.matcher(s).find();
		
		System.out.println(hasSpecialChar);

	}
	
	//WECJP00000753
	//WECJP00000909/
	
	//408-506-9702

}
