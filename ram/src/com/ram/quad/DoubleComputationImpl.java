package com.ram.quad;

import java.util.Arrays;

public class DoubleComputationImpl implements Computation<Double>{

	@Override
	public Double compute() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double doAddition(Double[] list, Double total) {
		// TODO Auto-generated method stub
				for (int i=0;i< list.length;i++) {
					total += list[i];
				}
				if (total.isInfinite() || total.isNaN()){
			        throw new ArithmeticException("Illegal double value: " + total);
			    }
				return total;
	}

	@Override
	public Double doRecursiveAddition(Double[] list, Double total) {
		if (list.length == 0) {
			
			if (total.isInfinite() || total.isNaN()){
		        throw new ArithmeticException("Illegal double value: " + total);
		    }
			return total;
		} else {
			total += list[0];
			return doRecursiveAddition(Arrays.copyOfRange(list, 1, list.length), total);
		}
	}

	@Override
	public Double calculateMean(Double[] list, Double size) {
		double total = 0;
		for (int i=0;i< size;i++) {
			total += list[i];
		}
		return (total / size);
	}

	@Override
	public Double calculateRecursiveMean(Double[] list, Double size) {
		double sum;
		double mean;
		if (size == 1) {
			sum =  list[0];
		} else {
			sum = list[(int) (size - 1)] + (size -1 ) * calculateRecursiveMean(list,size - 1 );
		}
		mean = sum / size;
		return mean;
	}

	@Override
	public Double calculateMedian(Double[] list) {
		Arrays.sort(list);
		int middle = list.length / 2;
		
		if (middle % 2 == 1) {
			return list[middle];
		} else {
			return (list[middle -1]  +  list[middle] / 2) ;
		}
	}

}
