package com.lixin.ch7;

public class Test4
{
	
	public static void main(String[] args)
	{
		int  a=10;
		
		//JDK1.8支持字符串类型的判断
		switch(a)
		{
		   case 10:
			   System.out.println("-------");
			   break;
		   case 20:
			   System.out.println("*******");
			   break;
		   case 30:
			   System.out.println(".........");
			   break;
		    default:
		    	System.out.println("..default.");
		}
	}

}
