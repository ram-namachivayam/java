package com.ram.home;

public class FindLevelDiffInTree {
	
	static class Node {

		int data;

		public int getData() {
			return data;
		}

		Node left,right;
		
		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public Node(int n) {
			this.data = n;
		}

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n1 = new Node(5);

		Node n2 = new Node(2);

		Node n3 = new Node(6);

		Node n4 = new Node(1);

		Node n5 = new Node(4);

		Node n6 = new Node(8);

		Node n7 = new Node(3);

		Node n8 = new Node(7);

		Node n9 = new Node(9);

		n1.setLeft(n2);

		n1.setRight(n3);

		n2.setLeft(n4);

		n2.setRight(n5);

		n3.setRight(n6);

		n5.setLeft(n7);

		n6.setLeft(n8);

		n6.setRight(n9);
		
		System.out.println(calculateSum(n1, 0) );
		
		System.out.println(countLeaves(n1) );

	}
	
	public static int calculateSum(Node n, int level) {
		int sum = 0;
		if (n != null) {
			if (level == 1) {
				sum = -n.getData();
				sum = sum + calculateSum(n.getLeft(), 0) + calculateSum(n.getRight(), 0);
			} else {
				sum = n.getData();
				sum = sum + calculateSum(n.getLeft(), 1) + calculateSum(n.getRight(), 1);
			}
		}
		return sum;
	}
	
	public static int countLeaves(Node n) {
		if (n == null) {
			return 0;
		}
		if (n.getLeft() == null && n.getRight() == null) {
			return 1;
		}
		
		return countLeaves(n.getLeft()) + countLeaves(n.getRight());
	}

}
