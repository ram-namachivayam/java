package com.ram.home.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

import com.ram.home.Node;

public class DisplayTreeAtEachLevel {

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
		
		displayNode1(n1, 0);
		
		System.out.println();
		
		displayNode2(n1);
		
		System.out.println();
		
		Map<Integer, ArrayList<Integer>> levelMap = new HashMap<Integer, ArrayList<Integer>>();
		
		displayNodeMap(n1, 0, levelMap);
		
		System.out.print("size of map is " + levelMap.size());
		
		Iterator<Entry<Integer, ArrayList<Integer>>> itr = levelMap.entrySet().iterator();
		
		while (itr.hasNext()) {
			Map.Entry<Integer, ArrayList<Integer>> entry =  itr.next();
			System.out.print( "level is " + entry.getKey());
			
			System.out.print( " Nodes:: " + entry.getKey());
			
			for (Integer it:entry.getValue()) {
				System.out.print( " " + entry.getKey());
			}			
		}
		
		System.out.println();
		
		for (int i=0;i<3;i++) {
			System.out.print("level " + i + " :: Nodes -> " );
			displayNode(n1, i);
			System.out.println();
		}	
		
		
	}
	
	public static void displayNode2(Node n) {
		PriorityQueue<Node> pq  = new PriorityQueue<Node>();
		
		pq.add(n);
		
		int height = 0;
		
		while (!pq.isEmpty()) {
			
			Node nn =  pq.poll();
			
			System.out.print(" " + nn.getData()  + " ");
			
			//height ++;
			
			if (nn.getLeft() != null ) {
				pq.add(nn.getLeft());
			}
			
			if (nn.getRight() != null) {
				pq.add(nn.getRight());
			}			
		}
		height ++;
		
	}
	
	public static void displayNode1(Node n, int level) {
	
		
		if (n.getLeft() != null) {
			displayNode1(n.getLeft(), level + 1);
		}
		
		
		
		if (n.getRight() != null) {
			displayNode1(n.getRight(), level + 1);
		}
		
		System.out.println("level " + level + " :: Nodes -> " + n.getData());
		
		
	}
	
	public static void displayNodeMap(Node n, int level, Map<Integer, ArrayList<Integer>> levelMap) {
	
		if (levelMap.containsKey(level)) {
			
			levelMap.get(level).add(n.getData());
			
		} else {
			ArrayList<Integer> tempList = new ArrayList<Integer>();
			tempList.add(n.getData());
			levelMap.put(level, tempList);
		}
		
		if (n.getLeft() != null) {
			displayNode1(n.getLeft(), level + 1);
		}
		
		if (n.getRight() != null) {
			displayNode1(n.getRight(), level + 1);
		}
		
		
	}
	
	public static void displayNode(Node n, int level) {
		if (level == 0) {
			System.out.print(n.getData() + " ");
		}
		
		if (n.getLeft() != null) {
			displayNode(n.getLeft(), level -1);
		}
		
		if (n.getRight() != null) {
			displayNode(n.getRight(), level-1);
		}
	}

}
