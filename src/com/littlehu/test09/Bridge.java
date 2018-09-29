package com.littlehu.test09;

public abstract class Bridge {
	AnimalEating ae;
	
	public Bridge(AnimalEating ae){
		this.ae=ae;
		
	}
	
	abstract void eat();

}
