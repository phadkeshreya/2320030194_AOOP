package com.image;

public class JpgShower implements AdvancedImageViewer {
	 @Override
	    public void showPng(String fileName) {
	        
	    }

	    @Override
	    public void showJpg(String fileName) {
	        System.out.println("Displaying JPG file: " + fileName);
	    }
}
