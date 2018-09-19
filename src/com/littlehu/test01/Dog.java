package com.littlehu.test01;

public class Dog {

	private String name;
	private String food;
	private int height;
	private String desc;
	
	
	public Dog(String name, String food, int height, String desc) {
		super();
		this.name = name;
		this.food = food;
		this.height = height;
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", food=" + food + ", height=" + height + ", desc=" + desc + "]";
	}
	
	
	
	
	
}
