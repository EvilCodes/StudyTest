package com.littlehu.test33;

import java.util.concurrent.SynchronousQueue;

public class Service1 implements Service{

	@Override
	public String getName() {
		return "Service1";
	}

	@Override
	public void execute() {
		System.out.println("Executing Service1");
		
		
	}

}
