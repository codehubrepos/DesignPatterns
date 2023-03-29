package com.designpatterns.structural.bridge;

public class Client {

	public static void main(String[] args) {
		Video youtubeVideo = new YoutubeVideo(new HDProcessor());
		youtubeVideo.play("samplefile.mp4");
		
		Video netflixVideo = new NetflixVideo(new UHD4KProcessor());
		netflixVideo.play("animal-planet.mp4");
		
	}

}
