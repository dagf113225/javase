package com.lixin.lesson8;

//һ����AABB����֤���
public class UserThread  extends  Thread
{
	
	public void  run()
	{
		System.out.println(Thread.currentThread().getName()+"-->A");
		
		try
		{
			//ʹ��ǰ�������е��߳�˯��,һ���ó���ǰ�̵߳�ִ��Ȩ�������̣߳�
			//˯��ʱ�䵽���߳̽��뵽������״̬���ٴα�JVM����--������״̬
			Thread.sleep(2000);//u1,u2
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"-->B");
	}

}
