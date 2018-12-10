package com.yxl.ch3;

public class Test1
{
	static int a = 20;
	
	int  b=10;
	public  Test1(int  a,  int b)
	{
		this.a=a;
		this.b=b;
	}

	public static void main(String[] args)
	{

		Animal an = new Animal();
		an = new Cat();

		if (an instanceof Cat)
		{
			// 动物肯定是猫
			Cat c = (Cat) an;
			System.out.println("可以转");
		}
		else
		{
			System.out.println("不能转换");
		}
	}

}
