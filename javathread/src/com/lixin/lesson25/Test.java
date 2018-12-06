package com.lixin.lesson25;

import java.util.Scanner;

public class Test
{
	static UserThread[] us;
	static
	{
		us = new UserThread[3];

		for (int i = 0; i < us.length; i++)
		{
			us[i] = new UserThread();
			us[i].start();
		}
	}

	public static void main(String[] args)
	{

		int j = 0;
		int i = 0;
		while (true)
		{
			System.out.println("请用户您输入任务的名称:");

			// 1.从键盘接受输入任务
			Scanner s = new Scanner(System.in);
			String taskName = s.next();
			System.out.println("任务名称为:-->" + taskName);

			// 2.从 线程池找出哪些线程是休闲的?
			// [0,1,2]
			int poolSize = us.length - j;
			for (; i < us.length;)
			{

				if (!us[i].isFlag())
				{
					System.out.println("线程在休闲的数量为:-->" + poolSize);
					us[i].setTaskName(taskName);
					us[i].setFlag(true);

					j++;
					i++;
					break;

				}

			}

			if (i >= us.length)
			{

				i = 0;
				j=0;
			}

		}

	}
}
