package com.littlehu.test09;

public class TestMain {
	
	public static void main(String[] args) {
		Bridge catBridge=new BridgeImpl("Ã¨", new CatEating());
		Bridge dogBridge=new BridgeImpl("¹·", new DogEating());
		catBridge.eat();
		dogBridge.eat();
	}

}
