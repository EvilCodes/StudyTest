package com.littlehu.test10;

import java.util.List;

public class AndDivide implements PersonDivide{
	private PersonDivide oneDivide;
	private PersonDivide otherDivide;
	
	public AndDivide(PersonDivide oneDivice,PersonDivide otherDivide) {
		this.oneDivide=oneDivice;
		this.otherDivide=otherDivide;
	}

	@Override
	public List<Person> divide(List<Person> persons) {
		List<Person> psersonData=oneDivide.divide(persons);
		List<Person> lastData=otherDivide.divide(psersonData);
		return lastData;
	}

}
