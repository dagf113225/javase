package com.lixin.lesson28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test1
{
	public static void main(String[] args)
	{

		try
		{

			FileInputStream fis = new FileInputStream(new File(
					"./users/user.data"));
			ObjectInputStream ois = null;

			//判断这个文件的容量>0,有对象
			while (fis.available() > 0)
			{
				// 每次都new一个新的ObjectInputStream
				ois = new ObjectInputStream(fis);
				//反序列化
				User u = (User) ois.readObject();
				System.out.println(u.getName());
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
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
