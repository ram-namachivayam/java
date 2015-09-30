package com.ram.quad;

import java.util.Arrays;

public class FloatComputationImpl implements Computation<Float>{

	@Override
	public Float compute() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float doAddition(Float[] list, Float total) {
		for (int i=0;i< list.length;i++) {
			total += list[i];
		}
		if (total.isInfinite() || total.isNaN()){
	        throw new ArithmeticException("Float overflow value: " + total);
	    }
		return total;
	}

	@Override
	public Float doRecursiveAddition(Float[] list, Float total) {
		if (list.length == 0) {
			
			if (total.isInfinite() || total.isNaN()){
		        throw new ArithmeticException("Float overflow value: " + total);
		    }
			return total;
		} else {
			total += list[0];
			return doRecursiveAddition(Arrays.copyOfRange(list, 1, list.length), total);
		}
	}

	@Override
	public Float calculateMean(Float[] list, Float size) {
		float total = 0;
		for (int i=0;i< size;i++) {
			total += list[i];
		}
		return (total / size);
	}

	@Override
	public Float calculateRecursiveMean(Float[] list, Float size) {
		float sum;
		float mean;
		if (size == 1) {
			sum =  list[0];
		} else {
			sum = list[(int) (size - 1)] + (size -1 ) * calculateRecursiveMean(list,size - 1 );
		}
		mean = sum / size;
		return mean;
	}

	@Override
	public Float calculateMedian(Float[] list) {
		Arrays.sort(list);
		int middle = list.length / 2;
		
		if (middle % 2 == 1) {
			return list[middle];
		} else {
			return (list[middle -1]  +  list[middle] / 2) ;
		}
	}

}
