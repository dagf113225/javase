package com.lixin.ch0;

import java.lang.reflect.Method;
import java.util.Date;

import com.lixin.util.SendMail;


//lang包下的直接的类，因为包比较烂，所以不要导入，会自动导入
//java的所有的类都在包下，肯定的。

//同包下的类不需要导入，不同包的类需要导入才能使用

//1.创建java所有的类都必须建立包。
//2.包名必须全部都是小写。
//3.包名 命名要求:com.你的名字.功能名

public class Test
{
	
	public static void main(String[] args)
	{
		String s="123";
	    //ctrl+shirft+o
		Method  m = null;
		
		Stu s1  =new Stu();
		
		SendMail  sm = new SendMail();
		
		Date  d = new Date();
	}

}
