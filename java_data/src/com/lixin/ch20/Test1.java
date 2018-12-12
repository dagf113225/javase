package com.lixin.ch20;

import java.util.Hashtable;

public class Test1
{
	public static void main(String[] args)
	{
		/**
		 * HashMap��Hashtable����?
		 * 
		 * HashMap�ļ���ֵ������Ϊ�� Hashtable�ļ���ֵ������Ϊ�� Hashtable���̰߳�ȫ�ģ�HashMap���ܷǰ�ȫ��
		 * 
		 */

		// final HashMap<String, String> maps = new HashMap<String, String>();
		   final Hashtable<String, String> maps = new Hashtable<String, String>();
		// ��ȫ����
		Thread t1 = new Thread(new Runnable()
		{

			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				for (int i = 0; i < 25; i++)
				{
					maps.put(String.valueOf(i), String.valueOf(i));
				}
			}
		});

		Thread t2 = new Thread(new Runnable()
		{

			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				for (int j = 25; j < 50; j++)
				{
					maps.put(String.valueOf(j), String.valueOf(j));
				}
			}
		});

		t1.start();
		t2.start();

		// ��ȫ����
		for (int k = 0; k < 50; k++)
		{
			if (!String.valueOf(k).equals(maps.get(String.valueOf(k))))
			{

				System.err.println(String.valueOf(k) + "-->"+ maps.get(String.valueOf(k)));

			}

		}

	}

}
