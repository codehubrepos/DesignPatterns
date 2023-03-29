package com.designpatterns.creational.factory;

import com.designpatterns.creational.factory.components.button.Button;
import com.designpatterns.creational.factory.components.dropdown.DropDown;
import com.designpatterns.creational.factory.components.menu.Menu;

/**
 * 
 * It is a combination of factory methods
 * 
 * */
public interface UIFactory {
	
	Menu createMenu();
	DropDown createDropDown();
	Button createButton();

}
