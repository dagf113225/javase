package com.lixin.ch7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

//�쳣����finally��
//finally�飺���ܳ������ʲô���⣬ʼ�ն���ִ��
//jdbc  Connection,IO,������Ҫ��finally�鼰ʱ�ر�
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
			
			System.out.println("ʼ�ն���ִ��.........");
		}
		
	}
	public static void main(String[] args)
	{
		
		Test t = new Test();
		t.check();
		
	}

}
