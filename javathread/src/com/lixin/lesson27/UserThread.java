package com.lixin.lesson27;

public class UserThread  extends Thread
{
	
	public  void  run()
	{
		System.out.println("A");
		
		//wait()һ����Ҫ notify()���ѣ����ѵ�ǰ�ᣬһ��ʹ����ͬ�������£��������ͬһ�����������
//		try
//		{
//			//һ���߳̿϶����ó�ִ��Ȩ������һ���߳�
//			Thread.sleep(2000);
//		}
//		catch (InterruptedException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		//һ���߳̿��ܻ��ó�ִ��Ȩ������һ���̣߳�Ҳ�п����ó����Լ�
		Thread.yield();
		System.out.println("B");
	}

}
