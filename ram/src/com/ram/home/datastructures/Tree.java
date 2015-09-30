package com.ram.home.datastructures;

public class Tree {
	
	private Node root;
	
	public Node find(int key) {
		
		Node current = root;
		
		while (current.getKey() != key) {
			
			if (key < current.getKey() ) {
				current = current.getLeftChild();
			} else {
				current = current.getRightChild();
			}
			if (current == null) {
				return null;
			}
		}
		
		return current;
		
	}
	
	public void insert(int key, String value) {
		
		Node newNode = new Node(key, value);
		
		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent;
			
			while(true) {
				parent = current;
				if (key < current.getKey()) {
					current = current.getLeftChild();
					
					if (current == null) {
						parent.setLeftChild(newNode);
						return;
					}
					
				} else {
					current = current.getRightChild();
					
					if (current == null) {
						parent.setRightChild(newNode);
						return;
					}
				}
			}
		}
		
		
	}
	
	public void delete(int id) {
		
	}
	
	public void inOrderTraverse(Node node) {
		if (node != null) {
			inOrderTraverse(node.getLeftChild());
			System.out.println(node.toString());
			inOrderTraverse(node.getRightChild());
		}
	}
	
	public void postOrderTraverse(Node node) {
		if (node != null) {
			postOrderTraverse(node.getLeftChild());
			postOrderTraverse(node.getRightChild());
			System.out.println(node.toString());
		}
	}
	
	public void preOrderTraverse(Node node) {
		if (node != null) {
			System.out.println(node.toString());
			postOrderTraverse(node.getLeftChild());
			postOrderTraverse(node.getRightChild());		
		}
	}
	
	public Node minimum() {
		Node current;
		Node last = null;
		current = root;
		
		while (current != null) {
			last = current;
			current = current.getLeftChild();
		}
		
		return last;
	}
	
	public Node maximum() {
		Node current;
		Node last = null;
		current = root;
		
		while (current != null) {
			last = current;
			current = current.getRightChild();
		}
		return last;
	}
		//26724571
	//26727637
	
	//surattifarsan mart
	

}
