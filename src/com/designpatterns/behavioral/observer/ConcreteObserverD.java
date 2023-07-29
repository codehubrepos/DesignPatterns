package com.designpatterns.behavioral.observer;

public class ConcreteObserverD implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("Observer D : "+m.getMessage());
	}

}
