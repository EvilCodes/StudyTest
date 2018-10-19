package com.littlehu.test21;

public class BinaryObserver extends Observe{
	
	public BinaryObserver(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String:"+Integer.toBinaryString(subject.getState()));
		
	}

}
