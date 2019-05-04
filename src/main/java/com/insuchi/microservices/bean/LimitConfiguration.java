package com.insuchi.microservices.bean;


public class LimitConfiguration {

	int maximum;
	int minimum;
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public LimitConfiguration() {
		
	}
	
}
