package com.littlehu.test10;

import java.util.ArrayList;
import java.util.List;

public class FemaleDiv implements PersonDivide{

	@Override
	public List<Person> divide(List<Person> persons) {
		
		List<Person> list=new ArrayList<>();
		for (Person person : persons) {
//			System.out.println(person.getGendar());
			if (person.getGendar().equals("Femal")) {
				list.add(person);
			}
		}
		return list;
	}

}
