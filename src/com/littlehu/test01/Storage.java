package com.littlehu.test01;

public interface Storage<T> extends IData{
	
	
	
	<T> void setType();
	
	<T> T get(String key);
	
	<T> boolean put(String key,T values);
	
	
	

}
