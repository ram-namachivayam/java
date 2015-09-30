package com.ram.home;

import com.ram.home.FindLevelDiffInTree.Node;

public class GetLevelForNodeWithKey {

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
		
		System.out.println(findLevel(n1, 8, 0));

	}

	
	public static int findLevel(Node n, int key, int level ) {
		
		if (n == null) {
			return 0;
		}
		
		if (n.data == key) {
			return level;
		}
		
		int downLevel = 0;
		
		
		downLevel = findLevel(n.getLeft(), key, level + 1);
		
		if (downLevel != 0) return downLevel;
		
		downLevel = findLevel(n.getRight(), key, level + 1);
		
		
		return downLevel;
	}

}
