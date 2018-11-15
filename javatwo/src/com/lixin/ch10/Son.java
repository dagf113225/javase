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
		
		//静态方法也叫做类方法，是属于哪个类，而不属于哪个对象，所以决定调用哪个静态方法，
		//是由声明的对象来决定的
		base.addB();
		System.out.println(son.a+","+son.b);// 8,7
		
	}

}
