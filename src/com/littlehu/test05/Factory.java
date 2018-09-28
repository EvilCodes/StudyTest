package com.littlehu.test05;

public class Factory {
	
	private Factory(){}
	
	
	static class Builder{
		public static Factory instance=new Factory();
	}
	
	public static Factory getInstance(){
		
		return Factory.Builder.instance;
	}
	
	
	public Shape getShape(String shape){
		Shape returnShape = null;
		System.out.println("param.shape="+shape);
		switch (shape) {
		case "Circle":
			returnShape= new Circle();
			break;

		case "Rectangle":
			returnShape= new Rectangle(); 
			break;
		}
		
		return returnShape;
	}

}
