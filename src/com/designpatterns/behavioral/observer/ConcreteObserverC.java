package com.designpatterns.behavioral.observer;

public class ConcreteObserverC implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("Observer C : "+m.getMessage());
	}

}
