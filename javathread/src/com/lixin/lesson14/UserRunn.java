package com.lixin.lesson14;

public class UserRunn implements Runnable
{
	
	//int  a=10;

	// synchronized同步安全，修饰方法，这个方法被加锁
	@Override
	public   void run()
	{
		System.out.println(Thread.currentThread().getName()
				+ "欢迎你来执行.........开始");
		
		synchronized(this)//()不 能是基本数据，必须是引用类型,同一个对象
		{
			// TODO Auto-generated method stub
			for (int i = 0; i < 10; i++)
			{
				System.out.println(Thread.currentThread().getName() + "-->" + i);
			}
		}
		
		System.out.println(Thread.currentThread().getName()
				+ "欢迎你来完成.........结束");
	}

}
