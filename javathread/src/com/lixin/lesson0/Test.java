package com.lixin.lesson0;

//ʶ���̣߳�ʶ���̵߳�һ��������Thread.currentThread().getName()
//1.ִ��main�����Ľ���main�̣߳�Ҳ�������̡߳�
//2.����һ���̣߳�����ʹ��start()������


//������˷����ӵ����������̡߳����ӵ���װ�����Ǿ���һ�����̡߳�
public class Test
{
	public  Test()
	{
		System.out.println(Thread.currentThread().getName()+"�̵߳�����--->���캯��");
	}
	
	public static void main(String[] args)
	{
		
		System.out.println(Thread.currentThread().getName()+"�̵߳�����--->main");
		
		Test  t = new Test();
		
		//������һ���̶߳���
		UserThread  u = new UserThread();
		
		//��������  �������̶߳���main�߳�
		//u.run();
		
		//����һ���̵߳ķ���  start()--->ִ�����̵߳��߳��巽��run()
		//��ǰ�����쵼�ɻ����һ���쵼��һ�������ɻ�൱��2�����ڸɻ�
		u.start();
	}

}
