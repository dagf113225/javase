package com.ltw.ch1;

public class Test
{
	//����:û�����֣�û��class
	public static void main(String[] args)
	{
	   final 	int a=10;

	   
		new Thread(new Runnable()
		{
	
			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				for(int i=0;i<=1000;i++)
				{
					System.out.println(a);
					System.out.println(Thread.currentThread().getName()+","+i);
				}
				
			}
		}).start();
		
		for(int k=0;k<=100;k++)
		{
			System.out.println(Thread.currentThread().getName()+","+k);
		}
	}

}
