package com.ram.home.general;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SpecialSerial implements Serializable{
	
	volatile int x = 10;
	transient int y = 3;
	static int z = 6;

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		SpecialSerial ss = new SpecialSerial();
		
		ObjectOutputStream opj = new ObjectOutputStream(new FileOutputStream("test.txt"));
		opj.writeObject(ss);
		
		ObjectInputStream opi = new ObjectInputStream(new FileInputStream("test.txt"));
		
		ss = (SpecialSerial) opi.readObject();
		
		System.out.println(ss.x + " " + ss.y + " " + ss.z);
		
		//650-380-2345

	}

}
