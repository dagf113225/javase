package com.lixin.lesson5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test
{
	
	public static void main(String[] args)
	{
		//�ֽ���Stream��β�Ķ����ֽ���,Input������;OutputStream
		
		//�ļ��ֽ����������
		//java�ֽ�����Ҫ��������ȡ�������ļ�������Ҳ���Զ�ȡ�ı��ļ�(��ȡ�ı��ļ������ܲ���)
	    try
		{
			FileInputStream  in = new FileInputStream("./javaIO��.txt");
		
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
