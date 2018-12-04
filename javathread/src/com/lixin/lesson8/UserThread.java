package com.lixin.lesson8;

//一定是AABB，保证结果
public class UserThread  extends  Thread
{
	
	public void  run()
	{
		System.out.println(Thread.currentThread().getName()+"-->A");
		
		try
		{
			//使当前正在运行的线程睡眠,一定让出当前线程的执行权给其它线程，
			//睡眠时间到后，线程进入到可运行状态，再次被JVM调度--》运行状态
			Thread.sleep(2000);//u1,u2
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"-->B");
	}

}
