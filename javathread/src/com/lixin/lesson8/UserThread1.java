package com.lixin.lesson8;

//AABB|ABAB
public class UserThread1  extends  Thread
{

	public void  run()
	{
		System.out.println(Thread.currentThread().getName()+"-->A");
		
		//�ò����ó�ִ��Ȩ,�п����ó�������̣߳��п����ó����Լ�
	     Thread.yield();
	     
		System.out.println(Thread.currentThread().getName()+"-->B");
	}

}
