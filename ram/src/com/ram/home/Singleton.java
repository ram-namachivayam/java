package com.ram.home;

public class Singleton {
	
	private static Singleton singletonInstance;
	
	private Singleton() {
		
	}
	
	public Singleton getInstance() {
		
		synchronized(this) {
			if (singletonInstance != null) {
				return new Singleton();
			}
		}
		
		return singletonInstance;
	}
	
	public Singleton clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
