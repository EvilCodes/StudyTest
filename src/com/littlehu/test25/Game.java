package com.littlehu.test25;
/**
 * 
 * @author: blackfox
 * @des:ģ��ģʽ���������ж��幫�еĲ���ʵ�ֵķ����������ڲ�ʵ�ֶԳ����
 * δʵ�ֵķ����ĵ��ã�����ķ����彻������ȥ��д��ɣ�����д�ĺô�������
 * ����ģ�巽����ʵ�֣������Ǽ̳й�ϵ������ȷʵĬ�ϴ��ڵ�
 *
 */
public abstract class Game {
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	/**
	 * ����һ��ģ�巽��
	 * 
	 */
	public final void play(){
		//��ʼ����Ϸ
		initialize();
		
		//��ʼ��Ϸ
		startPlay();
		
		//������Ϸ
		endPlay();
		
		
	}

}
