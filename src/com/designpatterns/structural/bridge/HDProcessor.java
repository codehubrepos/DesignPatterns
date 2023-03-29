package com.designpatterns.structural.bridge;

public class HDProcessor implements VideoProcessor {

	@Override
	public void process(String videoFile) {
		System.out.println("Process video using HD");
	}

}
