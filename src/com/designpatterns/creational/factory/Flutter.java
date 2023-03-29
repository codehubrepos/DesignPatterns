package com.designpatterns.creational.factory;

public class Flutter {

	private SupportedPlatform platform;
	
	public Flutter(SupportedPlatform platform) {
		this.platform=platform;
	}
	
	public void setTheme() {
		System.out.println("Set Some theme");
	}
	/**
	 * 
	 * This class should not have this logic since every time on addition of platform 
	 * this needs to be changed, so Let's have a factory of factory UIFactoryFactory
	 * */
	
	/*
	public UIFactory createUIFactory() {
		if(platform.equals(SupportedPlatform.ANDROID))
			return new AndroidUIFactory();
		else if(platform.equals(SupportedPlatform.IOS))
			return new IosUIFactory();
		return null;
	}
	*/
	
	public UIFactory createUIFactory() {
		return UIFactoryFactory.createUIFactory(platform);
	}

}
