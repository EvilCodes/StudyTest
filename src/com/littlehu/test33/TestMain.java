package com.littlehu.test33;


public class TestMain {

	public static void main(String[] args) {
		Service service = ServiceLoactor.getService("Service1");
		service.execute();
		service= ServiceLoactor.getService("Service2");
		service.execute();
		service= ServiceLoactor.getService("Service1");
		service.execute();
		service=ServiceLoactor.getService("Service2");
		service.execute();
		
		


	
	}
	
}
