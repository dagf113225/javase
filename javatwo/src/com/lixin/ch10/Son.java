package com.lixin.ch10;

public class Son extends Base
{

	Son()
	{
		
		a = 2;
		b = 2;
	}

	public void addA()
	{
		a += 6;
	}
	public static void addB()
	{
		b += 7;
	}
	public static void main(String[] args)
	{
		Son  son = new Son();
		System.out.println(son.a+","+son.b);
		
		System.out.println("--------------------------------");
		Base base=son;
		//父类的成员变量都被子类继承，共同拥有
		System.out.println(base.a+","+base.b);
		
		System.out.println("--------------------------------");
		
		base.addA();
		System.out.println(son.a+","+son.b);// 8,2
		
		son.addB();
		System.out.println(son.a+","+son.b);// 8,7
		
	}

}
