package com.littlehu.test22;

public class StartState implements State{

	@Override
	public void doAction(Context context) {
		System.out.println("Player si in start state");
		context.setState(this);
		
	}
	
	@Override
	public String toString() {
		return "Start State";
	}

}
