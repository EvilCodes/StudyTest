package com.littlehu.test24;

public class TestMain {
	public static void main(String[] args) {
		Context context=new Context(new OperationAdd());
		System.out.println("10+5="+context.executeStrategy(10, 5));
		System.out.println("context1="+context);
		
		
		context=new Context(new OperationMultiply());
		System.out.println("10*5="+context.executeStrategy(10, 5));
		System.out.println("context2="+context);
		
		
		context=new Context(new OperationSubstract());
		System.out.println("10-5="+context.executeStrategy(10, 5));
		System.out.println("context3="+context);
	}

}
