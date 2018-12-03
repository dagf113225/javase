package com.lixin.lesson1;

public class Test
{
	
	public static void main(String[] args)
	{
		//创建UserRunnable对象
		UserRunnable  u =  new UserRunnable();
		//u.run();
		
		
		//把一个UserRunnable对象转换成Thread对象
		//Runnable接口是Thread类的父类
		Thread  t1 = new Thread(u);
		
		t1.start();
	}

}
