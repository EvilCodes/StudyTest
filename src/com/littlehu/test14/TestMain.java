package com.littlehu.test14;

public class TestMain {
	private static final String colors[]={"Red","Green","Yellow","Blue","White","Black"};
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			Circle circle=(Circle) ShapeFactory.getCircle(getRandomColor());
			
			circle.setY(getRandomY());
			circle.setX(getRandomX());
			circle.setRadius(10);
			
			circle.draw();
		}
	}
	private static String getRandomColor() {
		return colors[(int) ((Math.random())*colors.length)];
	}
	
	private static int getRandomX(){
		return (int) (Math.random()*100);
	}
	
	private static int getRandomY(){
		return (int) (Math.random()*100);
	}

}
