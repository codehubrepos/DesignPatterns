package com.designpatterns.creational.singleton;

public class ThreadSafeSingletonDemo {

	public static void main(String[] args) {
		System.out.println("Demo for ThreadSafeSingleton");
		
		
		new Thread() {
			public void run() {
				for(int i=0;i<5;i++) {
					ThreadSafeSingleton t1 = ThreadSafeSingleton.getInstance1();
					System.out.println(t1.hashCode());
				}
			}
		}.start();
		
		
		new Thread() {
			public void run() {
				for(int i=0;i<5;i++) {
					ThreadSafeSingleton t2 = ThreadSafeSingleton.getInstance2();
					System.out.println(t2.hashCode());
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				for(int i=0;i<5;i++) {
					ThreadSafeSingleton t3 = ThreadSafeSingleton.getInstance3();
					System.out.println(t3.hashCode());
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				for(int i=0;i<5;i++) {
					ThreadSafeSingleton t4 = ThreadSafeSingleton.getInstance4();
					System.out.println(t4.hashCode());
				}
			}
		}.start();

	}

}
