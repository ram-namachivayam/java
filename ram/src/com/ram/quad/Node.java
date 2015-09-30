package com.ram.quad;

public class Node {
	private int key;
	@Override
	public String toString() {
		return "Node [key=" + key + ", value=" + value + "]";
	}

	private Node leftChild;
	
	public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

	private Node rightChild;
	
	public int getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	private String value;
	
	public Node(int key, String value) {
		this.key = key;
		this.value = value;
	}

}
