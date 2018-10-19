package com.littlehu.test20;

public class TestMain {

	public static void main(String[] args) {
		
		User robert=new User("Robert");
		User john=new User("John");
		
		
		robert.sendMessage("Hi! John!");
		
		john.sendMessage("Hello! Robert!");
	}
}
