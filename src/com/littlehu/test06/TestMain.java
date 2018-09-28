package com.littlehu.test06;

public class TestMain {
	public static void main(String[] args) {
		Builder builder=new MacbookBuilder();
		
		Director pcDirector=new Director(builder);
		pcDirector.construct("Ó¢ÌØÖ÷°å", "Retinaï@Ê¾Æ÷");
		System.out.println("Computer Info:"+builder.create().toString());
	}

}
