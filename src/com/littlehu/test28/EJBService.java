package com.littlehu.test28;

public class EJBService implements BusinessService{

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking EJB Service");
		
	}

}
