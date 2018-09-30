package com.littlehu.test10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMain {
	
	public static void main(String[] args) {
		
		List<Person> personData=new ArrayList<>();
		Person one =new Person("小王", "Male", "Single");
		Person two=new Person("小张", "Male", "UnSingle");
		Person three =new Person("小耿", "Femal", "Single");
		Person four =new Person("小柴", "Male", "Single");
		Person five=new Person("小卢", "Male", "unSingle");
		Person six =new Person("小花", "Femal", "unSingle");
		Person seven =new Person("小红", "Femal", "Single");
		
		
		personData.add(one);
		personData.add(two);
		personData.add(three);
		personData.add(four);
		personData.add(five);
		personData.add(six);
		personData.add(seven);
		
		PersonDivide femalDivide=new FemaleDiv();
		PersonDivide maleDivide=new MaleDiv();
		PersonDivide singleDivide=new CriterialSingle();
		
		
		PersonDivide orDivide=new OrDivide(femalDivide, maleDivide);
		List<Person>list=orDivide.divide(personData);
		
		PersonDivide andDivide=new AndDivide(femalDivide, singleDivide);
		
		List<Person>list2=andDivide.divide(list);
//		
		
		for (Person person : list) {
			
			System.out.println(person.toString());
			
		}
		
		System.out.println("------------------");
		
		for (Person person : list2) {
			System.out.println(person.toString());
		}
		
		
		
	}

}
