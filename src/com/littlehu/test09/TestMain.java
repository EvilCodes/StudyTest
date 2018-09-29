package com.littlehu.test09;

public class TestMain {
	
	public static void main(String[] args) {
		Bridge catBridge=new BridgeImpl("è", new CatEating());
		Bridge dogBridge=new BridgeImpl("��", new DogEating());
		catBridge.eat();
		dogBridge.eat();
	}

}
