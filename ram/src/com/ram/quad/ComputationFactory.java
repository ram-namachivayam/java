package com.ram.quad;

public class ComputationFactory {
	
	public static Computation<?> getComputation(String type) {
		if (type.equals("INTEGER")) {
			return new IntegerComputationImpl();
		}
		
		if (type.equals("DOUBLE")) {
			return new DoubleComputationImpl();
		}
		
		if (type.equals("FLOAT")) {
			return new FloatComputationImpl();
		}
		
		return null;
	}

}
