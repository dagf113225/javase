package com.lixin.lesson28;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

/**
 * 
 *  �û���ע����Ϣ�����ˣ��������ݿ�һ����Ϣ�������ļ��б���������Ϣ��
 *  ���ݳɹ��󣬷����Ÿ��û�.
 *  
 *  ע����Ϣ-->�������ݿ�-->�ļ�����-->�����Ÿ��û�
 *  
 *  
 * @author lenovo
 *
 */
public class TestUser
{
    public static void main(String[] args)
	{
		System.out.println("���û������������...");
		Scanner  s = new Scanner(System.in);
		String  name=s.next();
		
		System.out.println("���û������������...");
		Scanner  s1 = new Scanner(System.in);
		String  pwd=s1.next();
		
		
		User  u = new User();
		u.setName(name);
		u.setPwd(pwd);
		
		//������������
		CountDownLatch  c = new CountDownLatch(2);
		
		//���������߳�
		LastThread  lastThread = new LastThread(c);
		DBThread  dbThread = new DBThread(c,u);
		FileThread  fileThread = new FileThread(c,u);
		
		lastThread.start();
		dbThread.start();
		fileThread.start();
	}
}
