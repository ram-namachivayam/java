package com.ram.home;

public class Node implements Comparable{

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

		@Override
		public int compareTo(Object arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

		}
