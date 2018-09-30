package com.littlehu.test10;

import java.util.ArrayList;
import java.util.List;

public class CriterialSingle implements PersonDivide{

	@Override
	public List<Person> divide(List<Person> persons) {
		
		List<Person> list=new ArrayList<>();
		for (Person person : persons) {
			
			if (person.getMaritalStatus().equals("Single")) {
				list.add(person);
			}
		}
		return list;
	}

}
