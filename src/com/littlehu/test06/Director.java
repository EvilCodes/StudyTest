package com.littlehu.test06;

public class Director {
	Builder mBuilder=null;
	
	public Director(Builder builder){
		
		mBuilder=builder;
	}
	
	
	public void construct(String board,String display){
		mBuilder.buildBoard(board);
		mBuilder.buildDisplay(display);
		mBuilder.buildOS();
		
		
		
		
		
	}

}
