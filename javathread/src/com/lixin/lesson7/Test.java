package com.lixin.lesson7;

public class Test
{
	
	public  static void main(String[]  args)
	{
		
		//1.�����̶߳��� -->��
		UserThread  u =  new UserThread();
		UserThread  u1 =  new UserThread();
		
		//2.�߳̽��뵽������״̬
		//��: ���������У�˭�������������У�JVM��������������ǳ���Ա
		u.start();
		u1.start();
		
		
	}

}
