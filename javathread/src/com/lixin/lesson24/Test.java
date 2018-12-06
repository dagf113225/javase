package com.lixin.lesson24;

/**
 * 
 * 1.两个线程分别交替打印A,B
 * A,B,A,B,A,B
 * 
 *  1.1这两个线程都永远不死while(true){}
 *  1.2两个线程分别交替    同步环境下：wait------------ notify
 *  1.3完成打印
 * 
 * 
 * @author lenovo
 *
 */
public class Test
{
	
	public static void main(String[] args)
	{
		PrintOut  pout = new PrintOut();
		UserThread1  u1 = new UserThread1(pout);
		UserThread2  u2 = new UserThread2(pout);
		
		u1.start();
		u2.start();
	}
	

}
