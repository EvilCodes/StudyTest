package com.littlehu.test23;

public class TestMain {

	public static void main(String[] args) {
		AbstractCustomer customer1=CustomerFactory.getCustomer("Bob");
		AbstractCustomer customer2=CustomerFactory.getCustomer("Jerry");
		AbstractCustomer customer3=CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer4=CustomerFactory.getCustomer("Alen");
		
		System.out.println("Customers");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName()); 
		System.out.println(customer4.getName());
	}
}
