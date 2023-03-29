package com.designpatterns.creational.factory;

import com.designpatterns.creational.factory.components.button.Button;
import com.designpatterns.creational.factory.components.dropdown.DropDown;
import com.designpatterns.creational.factory.components.menu.Menu;

public class Client {

	public static void main(String[] args) {
		Flutter flutter = new Flutter(SupportedPlatform.ANDROID);
		UIFactory uiFactory = flutter.createUIFactory();
		Menu menu = uiFactory.createMenu();
		Button button = uiFactory.createButton();
		DropDown dropDown = uiFactory.createDropDown();
	}
}
