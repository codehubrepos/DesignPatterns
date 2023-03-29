package com.designpatterns.creational.factory;

import com.designpatterns.creational.factory.components.button.AndroidButton;
import com.designpatterns.creational.factory.components.button.Button;
import com.designpatterns.creational.factory.components.dropdown.AndroidDropDown;
import com.designpatterns.creational.factory.components.dropdown.DropDown;
import com.designpatterns.creational.factory.components.menu.AndroidMenu;
import com.designpatterns.creational.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory {

	public AndroidUIFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Menu createMenu() {
		// TODO Auto-generated method stub
		return new AndroidMenu();
	}

	@Override
	public DropDown createDropDown() {
		// TODO Auto-generated method stub
		return new AndroidDropDown();
	}

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new AndroidButton();
	}

}
