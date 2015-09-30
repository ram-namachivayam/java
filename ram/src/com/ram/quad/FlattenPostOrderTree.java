package com.ram.quad;

import com.ram.home.datastructures.Node;

public class FlattenPostOrderTree {
	
	public class Tree {
		
		private Node root;
		
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
		
		public void postOrderTraverse(Node node) {
			if (node != null) {
				postOrderTraverse(node.getLeftChild());
				postOrderTraverse(node.getRightChild());
				System.out.println(node.toString());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlattenPostOrderTree postOrderTreeDemp = new FlattenPostOrderTree();
		Tree tree = postOrderTreeDemp.new Tree();
		tree.insert(30, "temp1");
		tree.insert(94, "temp2");
		tree.insert(9, "temp3");
		tree.insert(5, "temp4");
		tree.insert(24, "temp5");
		tree.insert(53, "temp6");
		tree.insert(98, "temp7");

		tree.postOrderTraverse(tree.root);
	}

}
