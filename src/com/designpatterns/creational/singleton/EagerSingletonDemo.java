package com.designpatterns.creational.singleton;

public class EagerSingletonDemo {

	public static void main(String[] args) {
		System.out.println("Demo for EagerSingleton");
		EagerSingleton o1 = EagerSingleton.getInstance();
		EagerSingleton o2 = EagerSingleton.getInstance();
		EagerSingleton o3 = EagerSingleton.getInstance();
		EagerSingleton o4 = EagerSingleton.getInstance();
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		System.out.println(o4.hashCode());
	}

}
