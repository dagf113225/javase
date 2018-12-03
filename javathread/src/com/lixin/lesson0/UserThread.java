package com.lixin.lesson0;

//Thread是线程的父类
public class UserThread  extends Thread
{
	
	//线程的可执行方法,线程体方法
	public void  run()
	{
		System.out.println("线程的名字--->"+Thread.currentThread().getName()+"    UserThread  is   run....");
	}

}
