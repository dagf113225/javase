package com.lixin.ch2;

public class Test
{
	
	public static void main(String[] args)
	{
		//接口中的变量都是常量，程序运行其值不能改变。
		//Driver.a=Driver.a+1;
		
	   System.out.println(Fixed.USERNAME);
	   int  a=10;
	   
	   //魔鬼数字
//	   if(8080==a)
//	   {
//		   
//	   }
	   
	   if(Fixed.TOMCAT_PORT==a)
	   {
		   
	   }
	}

}
