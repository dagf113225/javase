package com.lixin.lesson28;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

/**
 * 
 *  用户的注册信息过来了，插入数据库一条信息，再在文件中备份这条信息，
 *  备份成功后，发短信给用户.
 *  
 *  注册信息-->插入数据库-->文件备份-->发短信给用户
 *  
 *  
 * @author lenovo
 *
 */
public class TestUser
{
    public static void main(String[] args)
	{
		System.out.println("请用户输入你的姓名...");
		Scanner  s = new Scanner(System.in);
		String  name=s.next();
		
		System.out.println("请用户输入你的密码...");
		Scanner  s1 = new Scanner(System.in);
		String  pwd=s1.next();
		
		
		User  u = new User();
		u.setName(name);
		u.setPwd(pwd);
		
		//创建闭锁对象
		CountDownLatch  c = new CountDownLatch(2);
		
		//创建三个线程
		LastThread  lastThread = new LastThread(c);
		DBThread  dbThread = new DBThread(c,u);
		FileThread  fileThread = new FileThread(c,u);
		
		lastThread.start();
		dbThread.start();
		fileThread.start();
	}
}
