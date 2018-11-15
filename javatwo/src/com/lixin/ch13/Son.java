package com.lixin.ch13;

public class Son extends Base
{
	//子类和父类定义了同名的变量，子类将不再继承父类的同名变量。各自独立。
	int  a;
	
	static  int  b;
	
	int a1;

	int b1;
	

	
	Son()
	{
		
		a = 2;
		b = 2;
		
		a1=10;
		b1=10;
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
		
		System.out.println("子类:"+son.a+"---"+son.b+","+son.a1+","+son.b1);
		
		Base  base =son;
		
		//System.out.println("父类:"+base.a+"---"+base.b+","+base.a1+","+base.b1);
		
		System.out.println("----------------------");
		
		base.addA();
		System.out.println(son.a+","+son.b+","+base.a+","+base.b);//8,2,1,1
		
		base.addB();
		System.out.println(son.a+","+son.b+","+base.a+","+base.b);//8,2,1,6
	}

}
