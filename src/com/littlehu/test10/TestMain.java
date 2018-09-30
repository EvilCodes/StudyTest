package com.littlehu.test10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMain {
	
	public static void main(String[] args) {
		
		List<Person> personData=new ArrayList<>();
		Person one =new Person("С��", "Male", "Single");
		Person two=new Person("С��", "Male", "UnSingle");
		Person three =new Person("С��", "Femal", "Single");
		Person four =new Person("С��", "Male", "Single");
		Person five=new Person("С¬", "Male", "unSingle");
		Person six =new Person("С��", "Femal", "unSingle");
		Person seven =new Person("С��", "Femal", "Single");
		
		
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
