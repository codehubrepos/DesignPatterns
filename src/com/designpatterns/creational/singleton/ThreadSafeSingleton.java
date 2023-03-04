package com.designpatterns.creational.singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {
		
	}
	
	
	//Method Level Synchronization
	//Drawback : Threads will wait till other thread has released the lock, impacts the performance 
	public synchronized static ThreadSafeSingleton getInstance1() {
		// Some Logic Here
		if(instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	
	//Block Level Synchronization
	public static ThreadSafeSingleton getInstance2() {
		// Some Logic Here
		synchronized(ThreadSafeSingleton.class) {
			//Drawback : Every thread will check for null on entering critical section even if 1 instance is created, impacts performance
			if(instance == null) {    
				instance = new ThreadSafeSingleton();
			}
		}
		
		return instance;
	}
	
	//Synchronization of critical section only
	public static ThreadSafeSingleton getInstance3() {
		
		if(instance == null) {
			//Advantage : If instance is already created other threads will not take the lock, performance wise good
			synchronized(ThreadSafeSingleton.class) {
				instance = new ThreadSafeSingleton();
			}
		}
		return instance;
	}
	
	//Double Check Locking
	public static ThreadSafeSingleton getInstance4() {
		
		if(instance == null) {
			synchronized(ThreadSafeSingleton.class) {
				if(instance == null) {
					instance = new ThreadSafeSingleton();	
				}
			}
		}
		return instance;
	}

}
