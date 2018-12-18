package com.lixin.lesson28;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * ������CountDownLatch
 * һ���̵߳�һ������(������)����������ִ��.
 * 
 * һ����Ա���ϰ࣬6���°࣬������3��ͬ���°���������°ࡣ
 * 
 * һ���̵߳ȴ��������߳��������󣬲�ִ�С�
 * 
 * @author lenovo
 *
 */
public class Test
{
	public static void main(String[] args)
	{
		//�������߳��������м��
		final CountDownLatch   adw =  new CountDownLatch(3);
		
		System.out.println("6���°�.............");
		
		new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				System.out.println("��Ա���������ڴα��������ȴ�������λͬ���°�...");
				try
				{
					adw.await();
					
					System.out.println("��Ա��������,����ͬ���°��ˣ���Ҳ��������....");
				}
				catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}).start();
		
		for(int i=0;i<3;i++)
		{
			new Thread(new Runnable()
			{
				
				@Override
				public void run()
				{
					// TODO Auto-generated method stub
					try
					{
						System.out.println("ͬ��-->"+Thread.currentThread().getName()+"׼���°���...");
						Thread.sleep(new Random().nextInt(8000));
						adw.countDown(); //-1
						
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}).start();
		}
		
	}

}
