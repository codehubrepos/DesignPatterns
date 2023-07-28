package com.designpatterns.behavioral.strategy;

public class WalkPathCalculationStrategy implements PathCalculatorStrategy {

	@Override
	public void findPath(String source, String destination) {
		System.out.println("Path calculation via Walk");
		
	}

}
