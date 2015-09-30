package com.ram.home;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		// TODO Auto-generated method stub
		String tmp = s.displaySequence("1");
	    for (int i = 0; i < 10; i++) {
	    	System.out.println("I is " + i); 
	        System.out.println(tmp);
	        tmp = s.displaySequence(tmp);
	    }
	    
	    System.out.println("Done " ); 
	}
	
	 public String displaySequence(String input) {
		    HashMap<String, Integer> charCountMap = new HashMap<String,Integer>();
		    for (int i=0; i< input.length();i++) {
		      String inKey = input.charAt(i) + "";
		      if (charCountMap.get(inKey) != null) {
		        int count = charCountMap.get(inKey) + 1;
		        charCountMap.put(inKey, count);
		      }
		      else {
		        charCountMap.put(inKey, 1);
		      }                               
		    }
		    StringBuilder sbuf = new StringBuilder();                                 
		    for (int i=0;i<input.length();i++) {
		      String inKey = input.charAt(i) + "";
		      sbuf.append(charCountMap.get(inKey));
		      sbuf.append(inKey)    ;        
		    } 
		   
		   System.out.println(sbuf.toString());   
		   
		   return sbuf.toString();
		                  
		  }

}
