package com.littlehu.test26;

public class Monitor implements ComputerPart{

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
		
	}

}
