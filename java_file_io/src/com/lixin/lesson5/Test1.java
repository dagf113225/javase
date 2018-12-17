package com.lixin.lesson5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1
{

	public static void main(String[] args)
	{
		FileInputStream in = null;

		FileOutputStream out = null;
		try
		{
			// a2.png是个二进制文件，一定要用字节流
			in = new FileInputStream(new File("./a2.png"));

			// 构建一个输出流

			File f = new File("./images/aa.png");

			if (!f.getParentFile().exists())
			{
				f.getParentFile().mkdirs();
			}

			out = new FileOutputStream(f);

			int len = 0;

			while ((len = in.read()) != -1)
			{
				out.write(len);
			}
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
		finally
		{
			if (null != out)
			{
				try
				{
					out.close();
				}
				catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (null != in)
			{
				try
				{
					in.close();
				}
				catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
