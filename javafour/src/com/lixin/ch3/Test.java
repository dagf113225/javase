package com.lixin.ch3;

import java.util.Scanner;

public class Test
{
	// ΪʲôҪ�����Ľӿڶ���?
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
		
		System.out.println("����ƥ�����֤��Ϊ:"+uu.createCode());
	}

	public static void main(String[] args)
	{

		System.out.println("------�����û���׼�����ټ�λ����֤��?------");
		Scanner  s = new Scanner(System.in);
		
		double  money=s.nextDouble();
		
		Test t = new Test();
		t.CheckCode(money);
				
	}

}
