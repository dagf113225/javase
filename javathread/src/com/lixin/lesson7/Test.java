package com.lixin.lesson7;

public class Test
{
	
	public  static void main(String[]  args)
	{
		
		//1.创建线程对象 -->生
		UserThread  u =  new UserThread();
		UserThread  u1 =  new UserThread();
		
		//2.线程进入到可运行状态
		//可: 都可以运行，谁来调度他们运行，JVM，虚拟机，而不是程序员
		u.start();
		u1.start();
		
		
	}

}
