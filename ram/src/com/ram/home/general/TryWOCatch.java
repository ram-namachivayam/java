package com.ram.home.general;

public class TryWOCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 2;
		try {
			s = s/0;
			//throw new RuntimeException();
		} 
//		catch(Exception e) {
//			System.out.println("Exception is " + e);
//		}
		
		finally {
			System.out.println("hi..");
		}

	}

}
