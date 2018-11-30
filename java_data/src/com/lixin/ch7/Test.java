package com.lixin.ch7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

//异常处理finally块
//finally块：不管程序出现什么问题，始终都会执行
//jdbc  Connection,IO,流对象都要在finally块及时关闭
public class Test
{
	
	void check()
	{
		try
		{
			 BufferedReader  br = new BufferedReader(
					 new InputStreamReader(new  FileInputStream("a.mp4")));
			
			 int value= Integer.parseInt("a");
		}
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
		finally{ 
			
			System.out.println("始终都会执行.........");
		}
		
	}
	public static void main(String[] args)
	{
		
		Test t = new Test();
		t.check();
		
	}

}
