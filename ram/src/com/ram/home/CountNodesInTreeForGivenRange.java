package com.ram.home;

import com.ram.home.FindLevelDiffInTree.Node;

public class CountNodesInTreeForGivenRange {
	
	/*
	 * Input:
        10
      /    \
    5       50
   /       /  \
 1       40   100
Range: [5, 45]

Output:  3
There are three nodes in range, 5, 10 and 40

	 */

	public static void main(String[] args) {
		Node n1 = new Node(10);

		Node n2 = new Node(5);

		Node n3 = new Node(50);

		Node n4 = new Node(1);

		Node n5 = new Node(40);

		Node n6 = new Node(100);

		n1.setLeft(n2);

		n1.setRight(n3);

		n2.setLeft(n4);

		n3.setRight(n5);

		n3.setLeft(n6);
		
		System.out.println(getCount(n1, 5, 45));

	}
	
	public static int getCount(Node n, int low, int high) {
		
		if (n == null) return 0;
		
//		if (n.data == high || n.data == low) {
//			return 1;
//		}
		
		if (n.data <= high && n.data >= low) {
			return 1 + getCount(n.getLeft(), low, high) + getCount(n.getRight(), low, high);
		} else if (n.data < low) {
			return getCount(n.getRight(), low, high);
		} else {
			return getCount(n.getLeft(), low, high);
		}
	}

}
