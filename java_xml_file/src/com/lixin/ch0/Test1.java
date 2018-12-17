package com.lixin.ch0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test1
{
	
	public static void main(String[] args)
	{
		Properties  p = new Properties();
		try
		{
			p.load(new FileInputStream(new File("./src/a.properties")));
			
			System.out.println(p.getProperty("a"));
			

			System.out.println(p.getProperty("b"));
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
