package com.littlehu.test15;

public class RealImage implements Image{
	
	private String fileName;
	
	
	public RealImage(String fileName) {
		this.fileName=fileName;
		loadFromDisk(fileName);
		 
	}

	@Override
	public void display() {
		System.out.println("Displaying"+fileName);
		
	}
	
	private void loadFromDisk(String fineName){
		
		System.out.println("Loading"+fileName);
		
	}
	

}
