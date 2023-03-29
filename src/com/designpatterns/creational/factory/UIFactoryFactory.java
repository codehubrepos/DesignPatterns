package com.designpatterns.creational.factory;

public class UIFactoryFactory {

	public static UIFactory createUIFactory(SupportedPlatform platform) {
		
		switch(platform) {
			case ANDROID:
				return new AndroidUIFactory();
			
			case IOS:
				return new IosUIFactory();
			
			default:
				return null;
		}
		
	}

}
