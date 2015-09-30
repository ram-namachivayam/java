package com.ram.home;

public class Anagram {
	
	private static int size;
	private static char[] arrChar = new char[100];
	private static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "cats";
		size = input.length(); // find its size
		count = 0;
		for(int j=0; j<size; j++) // put it in array
		arrChar[j] = input.charAt(j);
		doAnagram(size);

	}
	
	public static void doAnagram(int newSize) {
		if (newSize == 1) {
			return ;
		}
		for (int j=0;j<newSize;j++) {
			doAnagram(newSize-1);
			if (newSize == 2) {
				display();
			}
			rotate(newSize);
		}
		
	}
	
	public static void rotate(int newSize) {
		int j;
		int position = size - newSize;
		char temp = arrChar[position];
		
		for (j=position+1;j<size;j++) {
			arrChar[j-1] = arrChar[j];
		}
		arrChar[j-1] = temp;
	}
	
	public static void display() {
		if(count < 99)
			System.out.print(" ");
		
		if(count < 9)
			System.out.print(" ");
			
		System.out.print(++count + " ");
		
		for (int i=0;i<size;i++) {
			System.out.print(arrChar[i]);
			
		}
		
		System.out.print(" ");
		System.out.flush();
				
		if (count%6 == 0) {
			System.out.println(" ");
		}
	}

}
