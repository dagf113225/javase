package com.lixin.ch0;

public class Test
{
	
	public static void main(String[] args)
	{
		//创建抽象类对象，抽象类是不能实例化
		//Base  base  = new Base();
		
		//抽象类一定是用来被继承的，一定是有子类
		//抽象类是一定依赖子类完成实例化。
		
		Base  base = new Son();
		base  = new Gril();
		
		//抽象类的作用就是为了增强继承，动态绑定，多态(方法重写)
		base.check();
	}

}
