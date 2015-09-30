package com.ram.home.datastructures;

public class TreeIsValidBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
		tree.insert(20, "ram");
		tree.insert(22, "ram");
		tree.insert(12, "ram");
		tree.insert(8, "ram");
		tree.insert(4, "ram");
		
		System.out.println(isValidBST(tree.find(12)));
	}
	
	public static boolean isValidBST(Node node) {
		
		if (node == null) {
			return false;
		}
		
		if ( (node.getLeftChild() != null && node.getKey() < node.getLeftChild().getKey()) || (node.getRightChild() != null && node.getKey() > node.getRightChild().getKey()) ) {
			return false;
		}
		
		 return isValidBST(node.getLeftChild()) && isValidBST(node.getRightChild());
	}

}
