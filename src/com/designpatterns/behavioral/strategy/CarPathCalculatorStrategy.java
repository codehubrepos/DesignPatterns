package com.designpatterns.behavioral.strategy;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy {

	@Override
	public void findPath(String source, String destination) {
		System.out.println("Path calculation via Car");
		
	}

}
