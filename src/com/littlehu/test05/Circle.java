package com.littlehu.test05;

public class Circle extends Shape{
	
	public Circle(){
		
		type="Բ";
	}
	

	@Override
	void draw() {
		System.out.println("this is a circle");
	}

}
