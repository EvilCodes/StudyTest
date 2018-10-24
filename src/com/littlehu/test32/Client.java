package com.littlehu.test32;

public class Client {
	FilterManager filterManager;
	
	public void setFilterManager(FilterManager filterManager){
		this.filterManager=filterManager;
	}
	
	
	public void sendRequest(String request){
		filterManager.filterRequest(request);
	}

}
