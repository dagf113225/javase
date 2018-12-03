package com.lixin.lesson3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 1.5个任务----------》5个线程，实际我们只使用了2个线程，
 * 就完成了任务，这样就节省了线程对象的开销。
 * 
 * 生活化的池的场景:
 * 1.开了个小吃店，每天有100个人来吃饭，请问：你准备多少张板凳?
 * 
 * 50张凳子，这个凳子可以反复使用 。凳子可以给A--》B--》C。。。
 * 
 * 任务<=线程数量(线程池（1,2）)
 * 5个任务---3个线程？？？？
 * 
 * 
 * @author lenovo
 *
 */
public class Test
{
	public static void main(String[] args)
	{

		// 创建一个固定线程池，池中的线程数量是2个
		ExecutorService poolThread = Executors.newFixedThreadPool(2);
		
		for(int  i=0;i<5;i++)
		{
			UserThread  ut = new UserThread();
			
			//放入到线程池中执行
			poolThread.execute(ut);
		}
		
		//关闭线程池
		poolThread.shutdown();

	}
}
