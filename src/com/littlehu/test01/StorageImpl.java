package com.littlehu.test01;

import java.util.ArrayList;

public  class StorageImpl implements Storage<Dog>{
	
	private ArrayList mList;

	@Override
	public <T> void setType() {
		mList=new ArrayList<T>();
		
	}

	@Override
	public <T> T get(String key) {
		int key_num = Integer.parseInt(key);
		T t=(T) mList.get(key_num);
		return t;
	}

	@Override
	public  <T> boolean put(String key, T values) {
		System.out.println(values.toString());
		mList.add(values);
		if (mList.size()!=0) 
			return true;
		return false;
	}
	
	
	private void sayHello(){
		System.out.println("Hello World!");
	}

	@Override
	public void saveData() {
		
	}

	
}


	



