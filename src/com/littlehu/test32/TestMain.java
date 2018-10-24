package com.littlehu.test32;

public class TestMain {
	public static void main(String[] args) {
		FilterManager filterManager=new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new DebugFilter());
		
		Client client=new Client();
		client.setFilterManager(filterManager);
		client.sendRequest("HOME");
	}

}
