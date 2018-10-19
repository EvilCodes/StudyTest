package com.littlehu.test26;

public class TestMain {
	public static void main(String[] args) {
		ComputerPart computer=new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}
