package com.lixin.lesson5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test
{
	
	public static void main(String[] args)
	{
		//字节流Stream结尾的都是字节流,Input：输入;OutputStream
		
		//文件字节输入输出流
		//java字节流主要是用来读取二进制文件，但是也可以读取文本文件(读取文本文件的性能不好)
	    try
		{
			FileInputStream  in = new FileInputStream("./javaIO流.txt");
		
		     int len=0;
		     
		     byte[]  buffer  = new byte[1024];
		     
		     while((len=in.read(buffer))!=-1)
		     {
		    	 System.out.print(new String(buffer));
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
	
	}

}
