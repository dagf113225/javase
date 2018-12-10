package com.lixin.ch12;

import java.util.ArrayList;


/**
 * ArrayList��Vector������:
 * 1.���ǵײ㶼�ǲ�������ʵ�ֵ�.
 * 2.ArrayList���̷߳ǰ�ȫ(û��synchronized)�����еķ������ǲ���synchronized���ε�,���ܺã��������ݷǰ�ȫ
 * 3.Vector���̰߳�ȫ(��synchronized)�����еķ���������synchronized���ε�,Vector���������������ݰ�ȫ
 * 
 * @author lenovo
 *
 */
//������ȫ����
public class Test6   implements  Runnable
{
	
	//����һ��ArrayList �̷߳ǰ�ȫ
	Object  obj =new Object();
	static  ArrayList  lists  = new ArrayList();
	//static  Vector  lists  = new Vector();
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		synchronized (obj)
		{
			for(int i=0;i<100;i++)
			{
				lists.add(i);
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		Test6   t6 = new Test6();
		
		Thread  t1 = new Thread(t6,"�߳�һ");
		Thread  t2 = new Thread(t6,"�̶߳�");
		Thread  t3 = new Thread(t6,"�߳���");
		
		t1.start();
		t2.start();
		t3.start();
		
		try
		{
			t1.join();
			
			t2.join();
			t3.join();
			
			
			System.out.println("lists�Ĵ�СΪ:"+lists.size());
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	

}
