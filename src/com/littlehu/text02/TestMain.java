package com.littlehu.text02;

public class TestMain {

	public static void main(String[] args) {
		
		ShapeFactory.getInstance().setShapeDesc("����").getShapeImpl().draw();
		
	}
}
