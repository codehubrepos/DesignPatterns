package com.designpatterns.creational.singleton;

public class SingletonDemo {

	public static void main(String[] args) {

		System.out.println("Demo for Singleton");
		MySingleton o1 = MySingleton.getInstance();
		MySingleton o2 = MySingleton.getInstance();
		MySingleton o3 = MySingleton.getInstance();
		MySingleton o4 = MySingleton.getInstance();
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		System.out.println(o4.hashCode());
	}

}
