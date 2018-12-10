package com.yxl.ch3;

public class Test
{
	
	
	public static void main(String[] args)
	{
		B  b = new B();
		
		//向上转型
		A  a =b;
		
		//向下转型
		B b1 =(B)a;
		
		System.out.println(b==b1);
	}

}
