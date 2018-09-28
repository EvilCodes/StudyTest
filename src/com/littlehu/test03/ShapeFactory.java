package com.littlehu.test03;

public class ShapeFactory extends AbstractFactory{
	
	private static AbstractFactory mFactory;
	private Shape mShape;
	
	
	private  ShapeFactory() {
		
	}
	
	
	public static AbstractFactory getInstance(){
		if (mFactory==null) {
			synchronized (ShapeFactory.class) {
				if (mFactory==null) {
					mFactory=new ShapeFactory();
					
				}
				
			}
			
		}
		return mFactory;
	}
	
	
	
	

	@Override
	Color getColor(String colorDesc) {
		return null;
	}

	@Override
	Shape getShape(String shapeDesc) {
		
		switch (shapeDesc) {
		case "Ô²ÐÎ":
			mShape=new Circle();
			
			
			
			break;
			
		case "Èý½ÇÐÎ":
			mShape=new Triangle();
			break;

		default:
			mShape=new Rectangle();
			break;
		}
		return mShape;
	}

}
