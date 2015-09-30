package com.ram.home.datastructures;

public class LinkedList {
	
	private Link first;
	
	public LinkedList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int id, String name) {
		Link newLink = new Link(id, name);
		newLink.next = first;
		first = newLink;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList() {
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
	}
	
	public Link get() {
		return first;
	}
	
	public Link find(int key) {
		Link current = first;
		while(current.id != key) {
			if (current.next == null) {
				return null;
			} else {
				current = current.next;
			}
		}
		return current;
	}
	
	public Link delete(int key) {
		Link current = first;
		Link previous = first;
		
		while (current.id != key) {
			if (current.next == null) {
				return null;
			} else {
				previous = current;
				current = current.next;
			}
		}
		if (current == first) {
			first = first.next;
		}
		else {
			previous.next = current.next;
		}
		return current;
	}
	
	/*
	 * 
	 * 
	 * 
	public Node reverseRec(Node prev, Node curr) {
    if (curr == null) return null;  

    if (curr.next == null) {
        curr.next = prev;
        return curr;

    } else {
        Node temp = curr.next; 
        curr.next = prev;
        return reverseRec(curr, temp);
    }               
}
	 */
	


	public Link ReverseList(Link current, Link previous)
	{
		if (current == null) return null;
		Link originalNext = current.next;
		current.next = previous;
		if (originalNext == null) return current;
		return ReverseList(originalNext, current);
	}


	
	public Link reverse(Link prev, Link current) {
		if (current == null) return null;
		if (current.next == null) {
			current.next = prev;
			return current;
		}
		else {
			Link nextLink = current.next;
			current.next = prev;
			return reverse(current, nextLink);
		}
	}
	
	public Link reverseIterative(Link head) {
		if (head == null || head.next == null) return head;
		Link prev = null;
		Link current = head;
		Link next = null;
		
		while (current != null) {
			next = current.next;
			
			current.next = prev;
			
			prev = current;
			current = next;
			
		}
		return prev;
	}
	
	public boolean findLoop(Link first) {
		//  Floyd's cycle-finding algorithm
		/*
		 *  The idea is to have two references to the list and move them at different speeds. Move one forward by 1 node and the other by 2 nodes.

    		If the linked list has a loop they will definitely meet.
    		Else either of the two references(or their next) will become null
		 * 
		 */
		if (first == null) return false;
		Link slow, fast ;
		
		slow = fast = first;
		
		while (true) {
			slow = slow.next; // 1 hop
			
			if (fast.next != null) fast = fast.next.next;
			else return false;
			
			if (slow == null || fast == null) {
				return false;
			}
			
			if (slow == fast) return true;
		}
	}
	
	public static Link merge(Link l1, Link l2) {
		if (l1 == null) return l2;
		if (l2 == null) return l1;
		
		Link l ;
		
		if (l1.id < l2.id) {
			l = l1;
			l.next = merge(l1.next, l2);
		} else {
			l = l2;
			l.next = merge(l1, l2.next);
		}
		
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.insertFirst(1, "ram");
		ll.insertFirst(2, "priya");
		ll.insertFirst(3, "karunya");
		ll.insertFirst(4, "kavya");
		
		ll.displayList();
		
		System.out.println(ll.first.name);
		
		ll.ReverseList(ll.first, null);
		
		//ll.reverseIterative(ll.first);
		
		//ll.reverse(null, ll.first);
		
		ll.displayList();
	}
	
	
	public class Link{
		private int id;
		private String name;
		private Link next;
		public Link getNext() {
			return next;
		}

		public Link(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		public void displayLink() {
			System.out.println("{" +id + ", " + name + "}");
		}
	}

}
