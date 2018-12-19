package com.lixin.lesson28;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.concurrent.CountDownLatch;

public class FileThread extends Thread
{

	CountDownLatch c;

	User u;

	public FileThread(CountDownLatch c, User u)
	{
		this.c = c;
		this.u = u;
	}

	public void run()
	{
		
	System.out.println("启动备份文件......");
		
		try
		{
			Thread.sleep(15000);
		}
		catch (InterruptedException e1)
		{
			// TODO Auto-generated catch block
		}

		File toFile = new File("./users/user.data");

		if (!toFile.getParentFile().exists())
		{
			toFile.getParentFile().mkdirs();
		}
		try
		{
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream(toFile,true));
			out.writeObject(u);
			
			this.c.countDown();

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
