package com.littlehu.test05;

public class TestMain {

	public static void main(String[] args) {
		Rectangle shape=(Rectangle) Factory.getInstance().getShape("Rectangle");
		
		Rectangle shapeCopy=(Rectangle) shape.clone();
		shapeCopy.setType("¿½±´Èý½Ç");
		System.out.println("copy:shape="+shapeCopy.getType());
		
		System.out.println("shape="+shape.getType());
		
		
		
//		Shape shape=new Rectangle();
//		System.out.println(shape.getType());
	}
}
