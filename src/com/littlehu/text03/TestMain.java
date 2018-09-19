package com.littlehu.text03;

public class TestMain {

	public static void main(String[] args) {
		
		AbstractFactory factory = FactoryProducer.getFactory("SHAPE");
		Shape shape = factory.getShape("������");
		shape.draw();
		
	}
}
