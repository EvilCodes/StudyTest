package com.littlehu.test25;
/**
 * 
 * @author: blackfox
 * @des:模板模式，抽象类中定义公有的不可实现的方法，方法内部实现对抽象的
 * 未实现的方法的调用，具体的方法体交给子类去覆写完成，这样写的好处是子类
 * 隐藏模板方法的实现，由于是继承关系但方法确实默认存在的
 *
 */
public abstract class Game {
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	/**
	 * 这是一个模板方法
	 * 
	 */
	public final void play(){
		//初始化游戏
		initialize();
		
		//开始游戏
		startPlay();
		
		//结束游戏
		endPlay();
		
		
	}

}
