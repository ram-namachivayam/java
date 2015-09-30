package com.ram.home;

import com.ram.home.FindLevelDiffInTree.Node;

public class HeightOfTree {
	
	//Write a Program to Find the Maximum Depth or Height of a Tree

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n1 = new Node(5);

		Node n2 = new Node(6);

		Node n3 = new Node(8);

		Node n4 = new Node(10);

		Node n5 = new Node(5);

		Node n6 = new Node(6);

		Node n7 = new Node(5);

		n1.setLeft(n2);

		n1.setRight(n3);

		n2.setLeft(n4);

		n2.setRight(n5);

		n3.setRight(n6);

		n3.setLeft(n7);
		
		System.out.println(maxDepth(n1));

	}
	
	public static int maxDepth(Node n) {
		
		if (n == null) return 0;
		else {
			int leftHeight = maxDepth(n.getLeft());
			int rightHeight = maxDepth(n.getRight());
			return 1 + Math.max(leftHeight, rightHeight);
		}
	}

}
