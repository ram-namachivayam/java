package com.ram.quad;

public interface Computation<T> {
	
	public T compute();
	
	public T doAddition(T[]  list, T object);
	
	public T doRecursiveAddition(T[] list, T object);
	
	public T calculateMean(T[] list, T object);
	
	public T calculateRecursiveMean(T[] list, T object);
	
	public T calculateMedian(T[] list);

}
