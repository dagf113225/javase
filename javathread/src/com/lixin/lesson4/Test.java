package com.lixin.lesson4;

//线程的启动，是无序的，并不是程序员可以控制的，而是JVM控制的

public class Test
{
	public static void main(String[] args)
	{
		MyThread  m1 = new MyThread();
		MyThread  m2 = new MyThread();
		MyThread  m3 = new MyThread();
		
		//通过线程的优先级进行控制，不能绝对保证，只能相对可能保证
		m2.setPriority(Thread.MAX_PRIORITY);
		
		//线程的名字是JVM分配的
		//能不能自己设置线程的名字
		m1.setName("线程one");
		m2.setName("线程two");
		m3.setName("线程three");
		
		//3个线程并不是按照代码的顺序进行先后执行的
		//线程的执行顺序不是我们程序员能够控制的
		m2.start();
		m3.start();
		m1.start();
	

	}
}
