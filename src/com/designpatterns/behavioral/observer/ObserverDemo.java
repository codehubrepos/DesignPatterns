package com.designpatterns.behavioral.observer;

public class ObserverDemo {

	public static void main(String[] args) {
		
		ConcreteObserverA a = new ConcreteObserverA();
		ConcreteObserverB b = new ConcreteObserverB();
		ConcreteObserverC c = new ConcreteObserverC();
		ConcreteObserverD d = new ConcreteObserverD();
		
		ConcreteSubject publisher = new ConcreteSubject();
		publisher.attach(a);
		publisher.attach(b);
		publisher.attach(c);
		
		System.out.println("**********There is a new update-1**********");
		publisher.notify(new Message("iPhone 15 is going to launch on 15th August."));
		
		publisher.detach(a);
		publisher.attach(d);
		
		System.out.println("**********There is a new update-2**********");
		publisher.notify(new Message("oPhone 13 prices are down now."));
		
	}

}
