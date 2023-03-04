package com.designpatterns.creational.singleton;

public class SingletonDemo {

	public static void main(String[] args) {

		System.out.println("Demo for Singleton");
		Singleton o1 = Singleton.getInstance();
		Singleton o2 = Singleton.getInstance();
		Singleton o3 = Singleton.getInstance();
		Singleton o4 = Singleton.getInstance();
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		System.out.println(o4.hashCode());
	}

}
