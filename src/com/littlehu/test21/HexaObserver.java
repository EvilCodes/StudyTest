package com.littlehu.test21;

public class HexaObserver extends Observe{

	public HexaObserver(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Hex String:"+Integer.toHexString(subject.getState()));
		
	}

}
