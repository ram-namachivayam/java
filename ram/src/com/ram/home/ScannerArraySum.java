package com.ram.home;

import java.util.Scanner;

public class ScannerArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n;
        String strArray;
        n = in.nextInt();
       
        in.nextLine();
        strArray = in.nextLine();
        
        if (n < 0 || n > 10) {
            System.exit(1);
        }
            
        String[] intArray = strArray.split(" ");
        
        long finalAnswer = 0;
        int maxLimit = (int) Math.pow(10, 10);
        
        for (int i=0;i<intArray.length;i++) {
            
            int temp = Integer.parseInt(intArray[i]);
            
            if (temp < 0 || temp > maxLimit) {
                System.exit(1);
            }
            finalAnswer += temp;
        }
        
        System.out.println(finalAnswer);

	}

}
