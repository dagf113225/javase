package com.lixin.lesson0;

import java.io.File;
import java.io.IOException;

public class Test1
{

	public static void main(String[] args)
	{
		File f = new File("./temp/bb.txt");

		// ´´½¨Ä¿Â¼
		if (!f.getParentFile().exists())
		{
			f.getParentFile().mkdirs();
		}

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
