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
			System.out.println("���û����������������:");

			// 1.�Ӽ��̽�����������
			Scanner s = new Scanner(System.in);
			String taskName = s.next();
			System.out.println("��������Ϊ:-->" + taskName);

			// 2.�� �̳߳��ҳ���Щ�߳������е�?
			// [0,1,2]
			int poolSize = us.length - j;
			for (; i < us.length;)
			{

				if (!us[i].isFlag())
				{
					System.out.println("�߳������е�����Ϊ:-->" + poolSize);
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
