package com.designpatterns.behavioral.strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		String  mode = "Walk";
		PathCalculatorStrategy p = PathCalculationFactory.getPathCalculatorStrategy(mode);
		p.findPath("Source-A", "Destination-B");
	}

}
