package com.littlehu.test10;

import java.util.ArrayList;
import java.util.List;

public class MaleDiv implements PersonDivide{

	@Override
	public List<Person> divide(List<Person> persons) {
		
		List<Person> list=new ArrayList<>();
		for (Person person : persons) {
			if (person.getGendar().equals("Male")) {
				list.add(person);
			}
		}
		return list;
	}

}
