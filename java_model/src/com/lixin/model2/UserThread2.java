package com.lixin.model2;

public class UserThread2  extends Thread
{
	
//	Object  obj =null;
//	
//	public UserThread2(	Object  obj )
//	{
//		this.obj=obj;
//	}
	public void  run()
	{
		SingleModel s2=	SingleModel.getInstance();
		System.out.println("s2-->"+s2);
	}

}
