package com.littlehu.test09;

public class BridgeImpl extends Bridge{
	
	private String animal;

	public BridgeImpl(AnimalEating ae) {
		super(ae);
	}
	
	public BridgeImpl(String animal,AnimalEating ae){
		super(ae);
		this.animal=animal;
	}

	@Override
	void eat() {
		System.out.println("this is a "+animal);
		ae.eat();
		
		
	}


}
