package com.image;

public class GalleryApp {
	public static void main(String[] args) {
        ImageViewer imageViewer = new ImageAdapter("png");
        imageViewer.show("png", "test.png");

        imageViewer = new ImageAdapter("jpg");
        imageViewer.show("jpg", "test.jpg");
    }
}
