package com.designpatterns.behavioral.observer;

public class ConcreteObserverB implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("Observer B : "+m.getMessage());
	}

}
