package com.ram.quad;

import java.util.Arrays;

public class QuadContainer {
	
	public class Container<T> {
		
		private T t;

		public T getT() {
			return t;
		}

		public void setT(T t) {
			this.t = t;
		}

	}
	
	private Container<?> parent;
	
	private Container<?>[] childList;
	
	private int initialCapacity = 10;
	
	private int size;
	
	public QuadContainer() {
		childList = new Container[initialCapacity];
		parent = null;
		size = 0;
	}
	
	public <T> void add(T data) {
		
		Container<T> c = new Container<T>();
		c.setT(data);
		
		if (parent == null) {
			parent = c;
		} else {
			
			if(childList.length - size <= 5){
	            increaseArraySize();
	        }
			
			childList[size++] = c;
		}		
	}
	
	private void increaseArraySize(){
		childList = Arrays.copyOf(childList, childList.length*2);
    }
	
	public Container<?> getRoot() {
		return parent;
	}
	
	public <T> boolean contains(T data) {
		//check if the data is of parent one
		if (parent.getT().equals(data)) {
			return true;
		}
		//since the data is not of parent one, check in the child list
		for (int i=0;i<size;i++) {
			if (childList[i].getT().equals(data)) {
				return true;
			}
		}
		return false;
	}

}
