package com.designpatterns.behavioral.strategy;

public class BikePathCalculationStrategy implements PathCalculatorStrategy {

	@Override
	public void findPath(String source, String destination) {
		System.out.println("Path calculation via Bike");
		
	}

}
