package com.littlehu.test10;

import java.util.List;

public class OrDivide implements PersonDivide{
	
	private PersonDivide oneDivide;
	private PersonDivide otherDivide;
	
	
	public OrDivide(PersonDivide oneDivide,PersonDivide otherDivide) {
		this.oneDivide=oneDivide;
		this.otherDivide=otherDivide;
		
	}

	@Override
	public List<Person> divide(List<Person> persons) {
		
		List<Person> firstDivide=oneDivide.divide(persons);
		List<Person> secodeDivice=otherDivide.divide(persons);
		
		
		for (Person person : secodeDivice) {
			if (!firstDivide.contains(person)) {
				firstDivide.add(person);
			}
		}
		return firstDivide;
	}

}
