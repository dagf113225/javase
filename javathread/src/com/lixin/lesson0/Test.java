package com.lixin.lesson0;

//识别线程，识别线程的一个方法：Thread.currentThread().getName()
//1.执行main方法的叫做main线程，也叫做主线程。
//2.启动一个线程，必须使用start()方法。


//打击敌人发射子弹，这是主线程。换子弹的装备，那就是一个子线程。
public class Test
{
	public  Test()
	{
		System.out.println(Thread.currentThread().getName()+"线程的名字--->构造函数");
	}
	
	public static void main(String[] args)
	{
		
		System.out.println(Thread.currentThread().getName()+"线程的名字--->main");
		
		Test  t = new Test();
		
		//创建了一个线程对象
		UserThread  u = new UserThread();
		
		//方法调用  工作的线程都是main线程
		//u.run();
		
		//启动一个线程的方法  start()--->执行了线程的线程体方法run()
		//以前都是领导干活，安排一个领导的一个下属干活，相当于2个人在干活
		u.start();
	}

}
