package com.littlehu.test32;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	
	/**
	 * ʵ�������;ֲ������ĶԻ�
	 * 	 1. ʵ����������������
	 * 	 2. ʵ�������洢λ��
	 *   3. 
	 */
	private List<Filter> filters=new ArrayList();
	private Target target;
	
	
	public void addFilter(Filter filter){
		filters.add(filter);
		
	}
	
	
	public void execute(String request){
		for (Filter filter : filters) {
			filter.execute(request);
			
		}
		target.execute(request);
	}
	
	
	public void setTarget(Target target){
		this.target=target;
	}
	
	
	
	

}
