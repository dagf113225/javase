package com.lixin.ch0;

public class Test
{
	
	public static void main(String[] args)
	{
		//声明一个整型的数组
		//在声明的时候，必须声明其长度
		//动态初始化，new 类型数组，必须要有长度
		int[]  as = new int[5];
		
		as[0]=1111;
		System.out.println(as[0]);
		
		System.out.println(as[4]);
		
		System.out.println(as[as.length-1]);
		
		
		//静态初始化  长度已经定义了，其实是隐式
		String[]   ss={"王启明","张三","20"};
		
		System.out.println(ss[ss.length-1]);
		
		System.out.println("--------------------");
		
		//ss[3]="刘燕凤";
		
		System.out.println(ss[ss.length-1]);
		
		//传统遍历  数组名[下标]
//		for(int i=0;i<ss.length;i++)
//		{
//			System.out.println(ss[i]);
//		}
		System.out.println("---------------------------------------");
		
		
		//foreach遍历 注意jdk的编译环境  JDK1.5，注意看一下eclipse编译环境
		for(String s:ss)
		{
			System.out.println("---s:"+s);
		}
		
		
		
//		String  s1="123";
//		System.out.println(s1.length());
	}

}
