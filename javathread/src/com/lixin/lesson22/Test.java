package com.lixin.lesson22;
/**
 * �߳�֮�佻������
 * 1.���̴߳����������߳�  ͨ�����캯��
 * 2.���̴߳����������߳�   ������synchronized��ʹ��notify
 * 2.���̴߳����������߳�
 * 
 * 
 * @author lenovo
 *
 */

public class Test
{
	
	public static void main(String[] args)
	{
		Object  obj = new Object();
		
		//Ϊʲô����һ�����߳�,ȥ�������̼߳���1.100֮��
		UserThread  ut = new UserThread(obj);
		ut.start();
		
		
		//ͬ����
		synchronized (obj)
		{
			try
			{
				System.out.println(Thread.currentThread().getName()+"--->....");
				//���̳߳���obj�̶߳���������ڴ˱�wait()������
				//�ȴ����߳�ȥ����
				obj.wait();
				
				System.out.println("---------------------------");
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	    
		
		
		
	}

	
}
