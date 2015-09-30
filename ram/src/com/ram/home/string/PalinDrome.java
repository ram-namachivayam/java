package com.ram.home.string;

public class PalinDrome {
	
	public static void main(String[] args) {
		String word = "test";
		int wordLength = word.length();
		boolean isPalinDrome = true;
		for (int i=0;i<wordLength;i++) {
			if (word.charAt(i) != word.charAt(wordLength-1-i)) {
				isPalinDrome = false;
			} 
		}
		
		System.out.println(isPalinDrome);
	}

}
