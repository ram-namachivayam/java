package com.ram.home.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.ram.home.datastructures.LinkedList;
import com.ram.home.datastructures.LinkedList.Link;

public class FindnthLinkFromLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		for (int i=11;i>0;i--) {
			l1.insertFirst(i, "ram" + i);
		}
		
		//l1.displayList();
		
		int position = 4;
		
		Link nthLink = getNthLink(l1, position);
		
		nthLink.displayLink();

	}
	
	private static Link getNthLink(LinkedList l1, int position) {
		Link p1 = l1.get();
		Link p2 = l1.get();
		
		for (int i=0;i< position-1;i++) {
			if (p2 == null) return null;
			p2 = p2.getNext();		
		}
		
		while (p2.getNext() != null) {
			p1 = p1.getNext();
			p2 = p2.getNext();
		}
		
		return p1;
	}

}
