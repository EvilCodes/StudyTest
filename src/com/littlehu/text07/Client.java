package com.littlehu.text07;

public class Client {
	public static void main(String[] args) {
		WordDocument wordDocument=new WordDocument();
		
		
		wordDocument.setmText("This is a Circle");
		wordDocument.addImage("Image a");
		
		wordDocument.showDocument();
		
		
		try {
			WordDocument docCopy=wordDocument.clone();
			docCopy.showDocument();
			docCopy.setmText("This is a Paper");
			docCopy.showDocument();
			wordDocument.showDocument();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		
	
	}
}
