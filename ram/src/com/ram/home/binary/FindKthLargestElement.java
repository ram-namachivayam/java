package com.ram.home.binary;

import com.ram.home.Node;

public class FindKthLargestElement {
	
	/*
	 * Given a Binary Search Tree (BST) and a positive integer k, find the kÕth largest element in the Binary Search Tree.

		For example, in the following BST, if k = 3, then output should be 14, and if k = 5, then output should be 10.
		
		The idea is to do reverse inorder traversal of BST. The reverse inorder traversal traverses all nodes in decreasing order. 
		While doing the traversal, we keep track of count of nodes visited so far. When the count becomes equal to k, we stop the traversal and print the key.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n1 = new Node(20);

		Node n2 = new Node(8);

		Node n3 = new Node(22);

		Node n4 = new Node(4);

		Node n5 = new Node(12);

		Node n6 = new Node(10);

		Node n7 = new Node(14);

		n1.setLeft(n2);

		n1.setRight(n3);

		n2.setLeft(n4);

		n2.setRight(n5);

		n5.setRight(n6);

		n5.setLeft(n7);
		
		findLargestElement(n1, 3, 0);

	}
	
	public static void findLargestElement(Node n, int k, int count) {
		
		if (n == null || count >= k) return;
		
		System.out.println("n is " + n.getData() + " count is " + count);
		
		if (n.getRight() != null)
		findLargestElement(n.getRight(), k, count);
		
		count++;
		
		if (count == k) {
			System.out.println("Kth largest element is " + n.getData());
			return;
		}
		
		if (n.getLeft() != null)
		findLargestElement(n.getLeft(), k, count);
		
	}

}
