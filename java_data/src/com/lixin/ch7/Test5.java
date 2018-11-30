package com.lixin.ch7;

public class Test5
{
	
	public static void main(String[] args)
	{
		int  a=10;
		
		//JDK1.8支持字符串类型的判断
		switch(a)
		{
		//穿透
		   case 10:
			   System.out.println("-------");
		       case 20:
			    System.out.println("*******");
			   break;
		   case 30:
			   System.out.println(".........");
			   break;
		 
		}
	}


}
