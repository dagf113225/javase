package com.lixin.lesson4;

//�̵߳�������������ģ������ǳ���Ա���Կ��Ƶģ�����JVM���Ƶ�

public class Test
{
	public static void main(String[] args)
	{
		MyThread  m1 = new MyThread();
		MyThread  m2 = new MyThread();
		MyThread  m3 = new MyThread();
		
		//ͨ���̵߳����ȼ����п��ƣ����ܾ��Ա�֤��ֻ����Կ��ܱ�֤
		m2.setPriority(Thread.MAX_PRIORITY);
		
		//�̵߳�������JVM�����
		//�ܲ����Լ������̵߳�����
		m1.setName("�߳�one");
		m2.setName("�߳�two");
		m3.setName("�߳�three");
		
		//3���̲߳����ǰ��մ����˳������Ⱥ�ִ�е�
		//�̵߳�ִ��˳�������ǳ���Ա�ܹ����Ƶ�
		m2.start();
		m3.start();
		m1.start();
	

	}
}
