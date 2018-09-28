package com.littlehu.test06;

public class MacbookBuilder extends Builder{
	
	private Computer mComputer=new MacBook();
	
	

	@Override
	public void buildBoard(String board) {
		mComputer.setBoard(board);
		
	}

	@Override
	public void buildOS() {
		
		mComputer.setOS();
		
	}

	@Override
	public void buildDisplay(String display) {
		mComputer.setDisplay(display);
		
	}

	@Override
	public Computer create() {
		return mComputer;
	}

}
