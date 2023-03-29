package com.designpatterns.creational.factory;

import com.designpatterns.creational.factory.components.button.Button;
import com.designpatterns.creational.factory.components.button.IosButton;
import com.designpatterns.creational.factory.components.dropdown.DropDown;
import com.designpatterns.creational.factory.components.dropdown.IosDropDown;
import com.designpatterns.creational.factory.components.menu.IosMenu;
import com.designpatterns.creational.factory.components.menu.Menu;

public class IosUIFactory implements UIFactory {

	public IosUIFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Menu createMenu() {
		// TODO Auto-generated method stub
		return new IosMenu();
	}

	@Override
	public DropDown createDropDown() {
		// TODO Auto-generated method stub
		return new IosDropDown();
	}

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new IosButton();
	}

}
