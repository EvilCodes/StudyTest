package com.littlehu.text08;

public class PicAdapter implements PicDisplay{
	BasicShowFormat basicShowFormat;
	

	@Override
	public void show(String format) {
		
		if (format.equals("PNG")) {
			basicShowFormat=new PngPic();
			basicShowFormat.showPng();
		}else if (format.equals("JPEG")) {
			basicShowFormat=new JpegPic();
			basicShowFormat.showJpeg();
			
		}
		
	}

}
