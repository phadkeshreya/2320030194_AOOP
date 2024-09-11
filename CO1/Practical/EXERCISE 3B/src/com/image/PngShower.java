package com.image;

public class PngShower implements AdvancedImageViewer {
	 @Override
	    public void showPng(String fileName) {
	        System.out.println("Displaying PNG file: " + fileName);
	    }

	    @Override
	    public void showJpg(String fileName) {
	      
	    }
}
