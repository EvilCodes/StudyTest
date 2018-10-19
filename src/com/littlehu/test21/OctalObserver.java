package com.littlehu.test21;

public class OctalObserver extends Observe{
	
	public OctalObserver(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		
		System.out.println("Octal String:"+Integer.toOctalString(subject.getState()));
		
	}

}
