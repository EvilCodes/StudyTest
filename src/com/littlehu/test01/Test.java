package com.littlehu.test01;

public class Test {
	
	public static void main(String[] args) {
		
		Storage storage=new StorageImpl();
		storage.setType();
		storage.put("xiaoming", new Dog(null,null,1,null));
		Dog dog=(Dog) storage.get("0");
		System.out.println(dog.getHeight());
		
	}

}
