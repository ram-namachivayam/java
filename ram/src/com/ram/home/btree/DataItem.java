package com.ram.home.btree;

public class DataItem {
	
	private int data;
	
	public DataItem(int item) {
		this.data = item;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public void display() {
		System.out.print(" " + data);
	}

}
