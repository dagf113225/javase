package com.lixin.lesson1;

public class Test
{
	
	public static void main(String[] args)
	{
		//����UserRunnable����
		UserRunnable  u =  new UserRunnable();
		//u.run();
		
		
		//��һ��UserRunnable����ת����Thread����
		//Runnable�ӿ���Thread��ĸ���
		Thread  t1 = new Thread(u);
		
		t1.start();
	}

}
