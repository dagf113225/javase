package com.yxl.ch3;

public class Test
{
	
	
	public static void main(String[] args)
	{
		B  b = new B();
		
		//����ת��
		A  a =b;
		
		//����ת��
		B b1 =(B)a;
		
		System.out.println(b==b1);
	}

}
