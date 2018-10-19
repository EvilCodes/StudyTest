package com.littlehu.test26;


public interface ComputerPartVisitor {
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(KeyBoard keyBoard);
	public void visit(Monitor monitor);

}
