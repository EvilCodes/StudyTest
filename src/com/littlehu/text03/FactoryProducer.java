package com.littlehu.text03;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String facDesc){
		
		if (facDesc.equals("SHAPE")) {
			return ShapeFactory.getInstance();
			
		}else {
			return ColorFactory.getInstance();
		}
	}
	

}
