package com.ram.quad;

public class ComputationTest {
	
	private enum TYPES {
		INTEGER, DOUBLE, FLOAT;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computation impl =  ComputationFactory.getComputation(TYPES.INTEGER.toString());
		Integer[] input = {10, 5, 6};
		
		System.out.println("Integer Computation");
		System.out.println("Add " + impl.doAddition(input, 0));
		
		System.out.println("Recursive Add " + impl.doRecursiveAddition(input, 0));
		
		System.out.println("Mean " + impl.calculateMean(input, input.length));
		
		System.out.println("Recursive Mean " + impl.calculateRecursiveMean(input, input.length));
		
		System.out.println("Median " + impl.calculateMedian(input));
		
		System.out.println();
		
		Computation doubleImpl = ComputationFactory.getComputation(TYPES.DOUBLE.toString());
		Double[] doubleInput = {10.0, 5.0, 6.0};
		int size = doubleInput.length;
		
		System.out.println("Double Computation");
		
		System.out.println("Add " + doubleImpl.doAddition(doubleInput, 0.0));
		
		System.out.println("Recursive Add " + doubleImpl.doRecursiveAddition(doubleInput, 0.0));
		
		System.out.println("Mean " + doubleImpl.calculateMean(doubleInput, (double)size));
		
		System.out.println("Recursive Mean " + doubleImpl.calculateRecursiveMean(doubleInput, (double)size));
		
		System.out.println("Median " + doubleImpl.calculateMedian(doubleInput));
		
		System.out.println();
		
		Computation floatImpl = ComputationFactory.getComputation(TYPES.FLOAT.toString());
		Float[] floatInput = {10.0f, 5.0f, 6.0f};
		size = floatInput.length;
		
		System.out.println("Float Computation");
		
		System.out.println("Add " + floatImpl.doAddition(floatInput, 0.0f));
		
		System.out.println("Recursive Add " + floatImpl.doRecursiveAddition(floatInput, 0.0f));
		
		System.out.println("Mean " + floatImpl.calculateMean(floatInput, (float)size));
		
		System.out.println("Recursive Mean " + floatImpl.calculateRecursiveMean(floatInput, (float)size));
		
		System.out.println("Median " + floatImpl.calculateMedian(floatInput));
		
		System.out.println();

	}

}
