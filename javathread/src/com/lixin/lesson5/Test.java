package com.lixin.lesson5;

//线程的启动，是无序的，并不是程序员可以控制的，而是JVM控制的

public class Test
{
	public static void main(String[] args)
	{
		MyThread  m1 = new MyThread();
		
		//一个线程启动后，能不能再次启动????
		//不能，一个线程启动后，这个线程就会死亡，不能再次启动，会出现异常状态异常...
		m1.start();
		m1.start();
	

	}
}
