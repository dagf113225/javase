package com.lixin.lesson11;

public class Test
{
	
	public static void main(String[] args)
	{
		UserRunn  u = new UserRunn();
		
		//ת�����߳�
		Thread  t1 = new Thread(u);
		Thread  t2= new Thread(u);
		
		t1.start();
		t2.start();
	}

}
