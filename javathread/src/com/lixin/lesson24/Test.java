package com.lixin.lesson24;

/**
 * 
 * 1.�����̷ֱ߳����ӡA,B
 * A,B,A,B,A,B
 * 
 *  1.1�������̶߳���Զ����while(true){}
 *  1.2�����̷ֱ߳���    ͬ�������£�wait------------ notify
 *  1.3��ɴ�ӡ
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
