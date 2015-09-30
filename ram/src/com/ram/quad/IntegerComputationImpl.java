package com.ram.quad;

import java.util.Arrays;

public class IntegerComputationImpl implements Computation<Integer>{

	@Override
	public Integer compute() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer doAddition(Integer[] list, Integer total) {
		// TODO Auto-generated method stub
		for (int i=0;i< list.length;i++) {
			total += list[i];
		}
		if (total > Integer.MAX_VALUE || total < Integer.MIN_VALUE){
	        throw new ArithmeticException("Integer overflow");
	    }
		return total;
	}

	@Override
	public Integer doRecursiveAddition(Integer[] list, Integer total) {
		if (list.length == 0) {
			
			if (total > Integer.MAX_VALUE || total < Integer.MIN_VALUE){
		        throw new ArithmeticException("Integer overflow");
		    }
			return total;
		} else {
			total += list[0];
			return doRecursiveAddition(Arrays.copyOfRange(list, 1, list.length), total);
		}
	}

	@Override
	public Integer calculateMean(Integer[] list, Integer size) {
		int total = 0;
		for (int i=0;i< size;i++) {
			total += list[i];
		}
		return (total / size);
	}

	@Override
	public Integer calculateRecursiveMean(Integer[] list, Integer size) {
		float sum;
		float mean;
		if (size == 1) {
			sum =  list[0];
		} else {
			sum = list[size - 1] + (size -1 ) * calculateRecursiveMean(list,size - 1 );
		}
		mean = sum / size;
		return Math.round(mean);
	}

	//Assumption - input should be in sorted order. Else, sorting needs to be done.
	//For safer side, doing sorting.
	@Override
	public Integer calculateMedian(Integer[] list) {
		Arrays.sort(list);
		int middle = list.length / 2;
		
		if (middle % 2 == 1) {
			return list[middle];
		} else {
			return (list[middle -1]  +  list[middle] / 2) ;
		}
	}
	
}
