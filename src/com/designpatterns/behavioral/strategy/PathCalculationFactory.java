package com.designpatterns.behavioral.strategy;

public class PathCalculationFactory {
	
	public static PathCalculatorStrategy getPathCalculatorStrategy(String mode) {
		
		switch(mode) {
			case "Car" : return new CarPathCalculatorStrategy();
			
			case "Bike" : return new BikePathCalculationStrategy();
			
			case "Walk" : return new WalkPathCalculationStrategy();
			
			default : return null;
		}
		
	}

}
