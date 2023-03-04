package com.designpatterns.creational.singleton;

public class EagerSingleton {
	
	//Eager Initialization
	private static EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {
		
	}

	public static EagerSingleton getInstance() {
		
		return instance;
	}
}
