package com.littlehu.text07;

import java.util.ArrayList;

public class WordDocument implements Cloneable{
	
	
	private String mText;
	private ArrayList<String> mImages=new ArrayList<>();
	public WordDocument(){
		
	}
	
	@Override
	protected WordDocument clone() throws CloneNotSupportedException {
		
		WordDocument doc=(WordDocument) super.clone();
		doc.mText=this.mText;
		doc.mImages=this.mImages;
		return doc;
	}

	public String getmText() {
		return mText;
	}

	public void setmText(String mText) {
		this.mText = mText;
	}

	public ArrayList<String> getmImages() {
		return mImages;
	}

	public void setmImages(ArrayList<String> mImages) {
		this.mImages = mImages;
	}
	
	
	public void addImage(String img){
		this.mImages.add(img);
		
		
	}
	
	public void showDocument(){
		System.out.println("Text:"+mText);
		System.out.println("Images List:");
		for (String string : mImages) {
			System.out.println("image name:"+string);
			
		}
		
	}
	
	

}
