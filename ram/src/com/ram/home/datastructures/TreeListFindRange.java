package com.ram.home.datastructures;

public class TreeListFindRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree tree = new Tree();
		tree.insert(20, "ram");
		tree.insert(22, "ram");
		tree.insert(12, "ram");
		tree.insert(8, "ram");
		tree.insert(4, "ram");
		
		print(tree.find(20), 5, 22);

	}
	
	public static void print(Node root, int low, int hi) {
		if (root == null) {
			return;
		}
		
		if (root.getKey() > hi) {
			print(root.getLeftChild(), low, hi);
		} else if (root.getKey() < low) {
			print(root.getRightChild(), low, hi);
		} else {
			print(root.getLeftChild(), low, hi);
			System.out.println(root.getKey());
			print(root.getRightChild(), low, hi);
		}
		
	}

}
