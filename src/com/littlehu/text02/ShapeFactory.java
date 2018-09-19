package com.littlehu.text02;

/**
 * 
 * @author BlackFox
 * 
 *
 */
public class ShapeFactory {
	
	
	public static Shape mShape;
	public static ShapeFactory instance;
	
	private ShapeFactory(){
		
	}
	
	public static ShapeFactory getInstance(){
		if (instance==null) {
			synchronized (ShapeFactory.class) {
				if (instance==null) {
					instance=new ShapeFactory();
				}
			}
		}
		return instance;
		
	}
	
	
	public  ShapeFactory setShapeDesc(String shapeDesc){
		
		switch (shapeDesc) {
		case "Ô²ÐÎ":
			
			mShape=new Circle();
			break;
			
		case "¾ØÐÎ":
			mShape=new Rectangle();
			break;
		case "Èý½Ç":
			mShape=new Triangle();

			break;
			
		}
		return this;
		
	}
	public  Shape getShapeImpl(){
		return mShape;
	}
	
	
	
	

}
