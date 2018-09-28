package com.littlehu.test03;

public class ColorFactory extends AbstractFactory{
	
	private static AbstractFactory mFactory;
	Color color;
	
	private  ColorFactory() {
	}
	
	public static AbstractFactory getInstance(){
		if (mFactory==null) {
			synchronized (ColorFactory.class) {
				if (mFactory==null) {
					mFactory=new ColorFactory();
				}
			}
		}
		return mFactory;
	};
	

	@Override
	Color getColor(String colorDesc) {
		switch (colorDesc) {
		case "ºìÉ«":
			color=new Red();
			break;
			
		case "ÂÌÉ«":
			color=new Green();
			break;

		default:
			
			color=new Blue();
			break;
		}
		
		
		return color;
	}

	@Override
	Shape getShape(String shapeDesc) {
		return null;
	}

}
