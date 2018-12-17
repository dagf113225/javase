package com.lixin.lesson5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2
{
	public static void main(String[] args)
	{
		FileInputStream in = null;

		FileOutputStream out = null;

		try
		{
			in = new FileInputStream("./src/a2.mp3");

			File f = new File("./mp3/cc1.mp3");

			if (!f.getParentFile().exists())
			{
				f.getParentFile().mkdirs();
			}
			out = new FileOutputStream(f);

			long startTime = System.currentTimeMillis();

			//IO流的读写性能.
//			int len = 0;
//
//			while ((len = in.read()) != -1)
//			{
//				out.write(len);
//			}
			
			
			int  len=0;
			
			
			byte[]   buffer  = new byte[2*2014];
			
			while ((len = in.read(buffer)) != -1)
			{
				out.write(buffer);
			}

			long endTime = System.currentTimeMillis();

			System.out.println("读取音乐文件的时间为:(一个字节一个字节)" + (endTime - startTime));
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
