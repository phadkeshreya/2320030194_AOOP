package com.image;

public class ImageAdapter implements ImageViewer {
	 AdvancedImageViewer advancedImageViewer;

	    public ImageAdapter(String imageType) {
	        if (imageType.equalsIgnoreCase("png")) {
	            advancedImageViewer = new PngShower();
	        } else if (imageType.equalsIgnoreCase("jpg")) {
	            advancedImageViewer = new JpgShower();
	        }
	    }

	    @Override
	    public void show(String imageType, String fileName) {
	        if (imageType.equalsIgnoreCase("png")) {
	            advancedImageViewer.showPng(fileName);
	        } else if (imageType.equalsIgnoreCase("jpg")) {
	            advancedImageViewer.showJpg(fileName);
	        }
	    }
}
