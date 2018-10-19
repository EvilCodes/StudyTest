package com.littlehu.test26;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{

	@Override
	public void visit(Computer computer) {
		
		
		System.out.println("Displaying  Computer");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("Display mouse");
		
	}

	@Override
	public void visit(KeyBoard keyBoard) {
		
		System.out.println("Display Keyboard");
	}

	@Override
	public void visit(Monitor monitor) {
		
		System.out.println("Display Monitor");
	}

}
