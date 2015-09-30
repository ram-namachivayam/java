package com.ram.home;


import java.util.PriorityQueue;

import com.ram.home.FindLevelDiffInTree.Node;
import com.ram.home.datastructures.Queue;

public class PrintSumOfElementsInTree {
	
	/*
	 * Write a function to print sum of elements at each level in a binary tree.
 
          5
     6       8
10   5    6   5
 
Output 

level 0: 5
level 1: 14
level 2 : 26
	 * 
	 */

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
		
//		for (int i=1;i<=3;i++) {
//			printSum(n1, i);
//		}
		
		//bfs(n1);
		
		for (int i=0;i < 3;i++) {
			System.out.println(i + " " + getNodeValueByDepth(n1, i));
		}
		
		
		
		//calculateSum(n1, 0) ;
		
		System.out.println();
		
		//calculateSum1(n1,0);
		
		//System.out.println(displaySumAtEachLevel(n1, 0));

	}
	
	public static int getNodeValueByDepth(Node n, int level) {
		int sum = 0;
		
		System.out.println("---> level " + level + " node " + n.data);
		
		if (level == 0) {
			
			return n.data;
		} 
		
		if (n.getLeft() != null) {
			sum += getNodeValueByDepth(n.getLeft(), level -1 );
		} 
		
		if (n.getRight() != null) {
			sum += getNodeValueByDepth(n.getRight(), level -1 );
		} 
		
		return sum;
		
	}
	
	
	public static int getNodeValueByDepth1(Node n, int level) {
		int sum = 0;

		/** If we have reached our desired level */
		if (level == 0) {
			if (n != null) {
				/** Assuming data is an int and not nullable */
				return n.data;
			} else {
				/** Change this to 0 if you don't want an error condition */
				return -1;
			}
		}

		/** We are not the desired level, so get the sum of .left and .right, knowing either may not exist */
		if (n.getLeft() != null) {
			sum += getNodeValueByDepth(n.getLeft(), level-1);
		}

		if (n.getRight() != null) {
			sum += getNodeValueByDepth(n.getRight(), level-1);
		}

		/** Now have evaluated every possible child and stored the sum, even if it is 0 */
		return sum;
	}
	
	public static void bfs(Node n) {
		//Queue q = new Queue();
		PriorityQueue<Node> q = new PriorityQueue<Node>();
		
		q.add(n);
		
		while (!q.isEmpty()) {
			Node nn = (Node) q.poll();
			System.out.println(nn.data);
			System.out.println(nn.getLeft());
			System.out.println(nn.getRight());
			
			if (nn.getLeft() != null) {
				q.add((Node)nn.getLeft());
			}
			if (nn.getRight() != null) {
				q.add((Node)nn.getRight());
			}
		}
		
		
	}
	
	public static void printSum(Node n, int level) {
		
		if (n == null) {
			return;
		}
		if (level == 1) {
			System.out.println(n.data);
		} else if (level > 1) {
			printSum(n.getLeft(), level-1);
			printSum(n.getRight(), level-1);
		}
		
	}
	
	public static int displaySumAtEachLevel(Node n, int level) {
		int sum = 0;
		if (n == null) { 
			return sum;
		}
		while (n != null) {
			sum = n.data;
			System.out.println("Level " + level + " " + sum);
			sum = sum +  displaySumAtEachLevel(n.getLeft(), level + 1) + displaySumAtEachLevel(n.getRight() , level + 1) ;
		}
		
		return sum;
	}
	
	public static int calculateSum1(Node n, int level) {
		int sum = 0;
		if (n != null) {
			if (level == 1) {
				sum = n.getData();
				System.out.println(" level " + level + " node value " + n.data);
				sum = sum + calculateSum(n.getLeft(), 0) + calculateSum(n.getRight(), 0);
			} else {
				sum = n.getData();
				System.out.println(" level " + level + " node value " + n.data);
				sum = sum + calculateSum(n.getLeft(), 1) + calculateSum(n.getRight(), 1);
			}
		}
		return sum;
	}
	
	public static int calculateSum(Node n,  int level) {
		int sum = 0;
		int temp = level;
		
		if (n == null) return sum;

		if (n != null) {
			if (level == 0) {
				
				System.out.println(" level " + level + " node value " + n.data);
				
				sum = n.data;
				
				System.out.println("Level " + level + " " + sum);
			
				sum = calculateSum(n.getLeft(),  1)  + calculateSum(n.getRight(),  1);
				
			} else if (level == 1) {
				
				System.out.println(" level " + level + " node value " + n.data);
				
				sum += n.data;
				
				sum = sum + calculateSum(n.getLeft(), 2)  + calculateSum(n.getRight(), 2); 
				
				//sum = sum + calculateSum(n.getLeft(),level + 1) +  calculateSum(n.getRight(), level + 1);
				
				System.out.println("Level " + level + " " + sum);
				
			} else if (level == 2) {
				
				System.out.println(" level " + level + " node value " + n.data);
				
				sum += n.data;
				
				sum = sum +  calculateSum(n.getLeft(), level + 1)  + calculateSum(n.getRight(), level + 1); 
				
				//sum = sum + calculateSum(n.getLeft(),level + 1) +  calculateSum(n.getRight(), level + 1);
				
				System.out.println("Level " + level + " " + sum);
			}
		}
		return sum;
	}

}
