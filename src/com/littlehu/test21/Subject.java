package com.littlehu.test21;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observe> observers=new ArrayList<Observe>();
	private int state;
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObervers();
	}
	
	public void attach(Observe observe){
		observers.add(observe);
	}
	
	public void notifyAllObervers(){
		for (Observe observe : observers) {
			observe.update();
			
		}
	}
	

}
