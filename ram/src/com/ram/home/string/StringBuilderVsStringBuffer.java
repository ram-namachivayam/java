package com.ram.home.string;

public class StringBuilderVsStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		long t;
		t = System.currentTimeMillis();
		for (int i=0;i<77777777;i++) {
			sb.append("1");
		}
		System.out.println("String Builder " + (System.currentTimeMillis() - t));
		
		StringBuffer sbuf = new StringBuffer();
		long t1 = System.currentTimeMillis();
		for (int i=0;i<77777777;i++) {
			sbuf.append("1");
		}
		
		System.out.println("String Buffer " + (System.currentTimeMillis() - t1));

	}

}
