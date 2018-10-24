package com.littlehu.test33;


public class ServiceLoactor {
	private static Cache cache;
	
	static{
		cache=new Cache();
	}
	
	public static Service getService(String jndiName){
		Service service = cache.getService(jndiName);
		if (service!=null) {
			return service;
			
		}
		InitialContex context=new InitialContex();
		Service service1= (Service) context.lookup(jndiName);
		cache.addService(service1);
		return service1;
		
	}

}
