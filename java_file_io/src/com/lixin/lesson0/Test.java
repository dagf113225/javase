package com.lixin.lesson0;

import java.io.File;
import java.io.IOException;

//1.创建目录
public class Test
{
	
	public static void main(String[] args)
	{
		//File类，构建一个File类，构建了具体目录和文件
//		File  f = new File("d://王启明.txt");
//		try
//		{
//			f.createNewFile();
//		}
//		catch (IOException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		File  f = new File("d://aa//cc//王启明.txt");
//		
//		File  ff=f.getParentFile();
//		System.out.println(ff.getName());
//		
//		//创建目录  mkdir只能创建当前目录，下面的子目录不能创建.
//		//  mkdirs创建当前目录包括下面的子目录创建.
//		ff.mkdirs();
//		
//		try
//		{
//			//创建目录下的文件
//			f.createNewFile();
//		}
//		catch (IOException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//相对路径
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
