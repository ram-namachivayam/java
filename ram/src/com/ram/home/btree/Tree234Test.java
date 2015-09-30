package com.ram.home.btree;

public class Tree234Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value;
		Tree234 theTree = new Tree234();
		theTree.insert(50);
		theTree.insert(40);
		theTree.insert(60);
		theTree.insert(30);
		theTree.insert(70);
		
		theTree.insert(65);
		theTree.insert(35);
		theTree.insert(75);
		theTree.insert(45);
		
		theTree.displayTree();
		
		Tree234 t = new Tree234();
		
		t.insert(10);
	    t.insert(20);
	    t.insert(5);
	    t.insert(6);
	    t.insert(12);
	    t.insert(30);
	    t.insert(7);
	    t.insert(17);
	    
	    t.insert(7);
	    t.insert(17);
	    
	    t.insert(23);
	    t.insert(15);
	    t.insert(26);
	    t.insert(22);
	    t.insert(37);
	    t.insert(47);
	    t.insert(57);
	    t.insert(67);
	    
	    System.out.println("\n");
	    
	    t.displayTree();

	}

}
