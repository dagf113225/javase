package com.lixin.model2;

public class UserThread1   extends Thread
{
	
//	Object  obj =null;
//	
//	public UserThread1(	Object  obj )
//	{
//		this.obj=obj;
//	}
	
	
	public void  run()
	{
		SingleModel s1=	SingleModel.getInstance();
		System.out.println("s1-->"+s1);
	}

}
