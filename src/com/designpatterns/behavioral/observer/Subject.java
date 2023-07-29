package com.designpatterns.behavioral.observer;

public interface Subject{
	
	//call attach to add subscribers/observers to be observer list
	public void attach(Observer observer);
	
	//call detach to remove subscribers/observers from the observer list
	public void detach(Observer observer);
	
	//call notify to publish all the changes made by the subject
	public void notify(Message message);

}
