package com.lixin.lesson0;

import java.io.File;
import java.io.IOException;

//1.����Ŀ¼
public class Test
{
	
	public static void main(String[] args)
	{
		//File�࣬����һ��File�࣬�����˾���Ŀ¼���ļ�
//		File  f = new File("d://������.txt");
//		try
//		{
//			f.createNewFile();
//		}
//		catch (IOException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		File  f = new File("d://aa//cc//������.txt");
//		
//		File  ff=f.getParentFile();
//		System.out.println(ff.getName());
//		
//		//����Ŀ¼  mkdirֻ�ܴ�����ǰĿ¼���������Ŀ¼���ܴ���.
//		//  mkdirs������ǰĿ¼�����������Ŀ¼����.
//		ff.mkdirs();
//		
//		try
//		{
//			//����Ŀ¼�µ��ļ�
//			f.createNewFile();
//		}
//		catch (IOException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//���·��
//		File  f = new File("./src/aa/Base.java");
//		f.getParentFile().mkdirs();
//		try
//		{
//			f.createNewFile();
//		}
//		catch (IOException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		File   f = new File("d://aa//bb","c.mp3");
		
		
		f.getParentFile().mkdirs();
		
		try
		{
			f.createNewFile();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
