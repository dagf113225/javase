package com.lixin.lesson10;

//A--B--A

/**
 * 
 * a
 * @author lenovo
 *
 */
public class Test
{
	
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName()+",main�߳�");
		
		UserThread  u = new UserThread();
		u.start();
		
		int count =1000;
		
		count=count/2;//500
		
		
		try
		{//�ϲ��߳�,�����̺߳ϲ������߳�������
			u.join();
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("���Ϊ:"+(count+u.getSum()));
	}
	

}
