package com.ram.home.list;

import java.util.LinkedList;
import java.util.List;

public class MergeSortedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1 = new LinkedList();
		List<Integer> l2 = new LinkedList();
		List<Integer> l3 = new LinkedList();
		
		l1.add(1);
		l1.add(3);
		l1.add(5);
		
		l2.add(2);
		l2.add(4);
		l2.add(6);
		
		System.out.println(l1.size() + " " + l2.size());
		
		while (!l1.isEmpty() && !l2.isEmpty()) {
			System.out.println(l1.get(0) + " " + l2.get(0));
			if (l1.get(0) < l2.get(0)) {
				l3.add(l1.remove(0));
			} else {
				l3.add(l2.remove(0));
			}
		}
		
		while (!l1.isEmpty()) {
			l3.add(l1.remove(0));
		}
		
		while (!l2.isEmpty()) {
			l3.add(l2.remove(0));
		}
		
		for (int i=0;i<l3.size();i++) {
			System.out.print(l3.get(i));
		}
		System.out.println();
	}

}
