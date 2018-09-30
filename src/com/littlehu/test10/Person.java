package com.littlehu.test10;

public class Person {
	
	private String name;
	private String gendar;
	private String maritalStatus;
	
	
	public Person(String name, String gendar, String maritalStatus) {
		super();
		this.name = name;
		this.gendar = gendar;
		this.maritalStatus = maritalStatus;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGendar() {
		return gendar;
	}
	public void setGendar(String gendar) {
		this.gendar = gendar;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gendar=" + gendar + ", maritalStatus=" + maritalStatus + "]";
	}
	
	
	
	
	

}
