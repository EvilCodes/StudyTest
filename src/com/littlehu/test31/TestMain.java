package com.littlehu.test31;

public class TestMain {

	public static void main(String[] args) {
		FrontController frontController=new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
		
		
	}
}
