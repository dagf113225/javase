package com.lixin.ch3;

import java.util.Scanner;

public class Test
{
	// 为什么要声明的接口对象?
	UserUtils uu;

	public void CheckCode(double money)
	{
		if (money < 1000)
		{
			uu = new NumberCode();
		}
		else
		{
			uu = new NumberAndCharCode();
		}
		
		System.out.println("和你匹配的验证码为:"+uu.createCode());
	}

	public static void main(String[] args)
	{

		System.out.println("------请问用户你准备多少价位的验证码?------");
		Scanner  s = new Scanner(System.in);
		
		double  money=s.nextDouble();
		
		Test t = new Test();
		t.CheckCode(money);
				
	}

}
