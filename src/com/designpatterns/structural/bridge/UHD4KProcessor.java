package com.designpatterns.structural.bridge;

public class UHD4KProcessor implements VideoProcessor {

	@Override
	public void process(String videoFile) {
		System.out.println("Process video using Ultra HD 4K");
	}

}
