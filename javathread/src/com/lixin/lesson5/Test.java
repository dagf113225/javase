package com.lixin.lesson5;

//�̵߳�������������ģ������ǳ���Ա���Կ��Ƶģ�����JVM���Ƶ�

public class Test
{
	public static void main(String[] args)
	{
		MyThread  m1 = new MyThread();
		
		//һ���߳��������ܲ����ٴ�����????
		//���ܣ�һ���߳�����������߳̾ͻ������������ٴ�������������쳣״̬�쳣...
		m1.start();
		m1.start();
	

	}
}
