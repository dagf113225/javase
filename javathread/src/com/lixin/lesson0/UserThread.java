package com.lixin.lesson0;

//Thread���̵߳ĸ���
public class UserThread  extends Thread
{
	
	//�̵߳Ŀ�ִ�з���,�߳��巽��
	public void  run()
	{
		System.out.println("�̵߳�����--->"+Thread.currentThread().getName()+"    UserThread  is   run....");
	}

}
