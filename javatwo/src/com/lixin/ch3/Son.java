package com.lixin.ch3;

//java中的继承只能直接继承一个爸爸，可以间接继承多个爸爸
public class Son extends Base
{
	static
	{
		System.out.println("-------------子类的静态块");
	}

	Son()
	{
		//super();//隐式的有个super()
		this("100"); //this()和super()都必须在第一行
		
		System.out.println("子类构造函数");
	  
	}
	Son(int a)
	{
		super(a);
	}
	Son(String s)
	{
	    super(10);
	}
	{
		System.out.println("-------------子类的构造块");
	}

	public static void main(String[] args)
	{
		//直接new 父类
		//Base  b = new Base();
		
		//直接new 子类  子类的构造一定依赖父类的构造
		Son   s   = new Son();
		
		//子类的构造一定依赖父类的构造
		//super(参数列表) 访问父类 提供的构造函数 必须在第一行
		//this(参数列表) 访问本类的构造函数

	}

}
