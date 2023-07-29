package com.designpatterns.behavioral.observer;

public class ConcreteObserverA implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("Observer A : "+m.getMessage());
	}

}
