package com.littlehu.test28;

public class JMSService implements BusinessService{

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking JMS Service");
		
	}

}
