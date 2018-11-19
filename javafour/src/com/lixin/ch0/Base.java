package com.lixin.ch0;

/**
 * 1.一个类修饰成abstract，这个类就是一个抽象类。
 *  2.抽象类内部可以有什么? 什么都可以有。
 *     抽象类中可以没有抽象方法，但是有抽象方法的类一定是抽象类
 *     
 *     
 *     设计抽象类和抽象方法的目的是什么？
 *     
 *              就是用来被继承，就是用来方法重写。
 *              
 *            抽象类一定是一个父类。
 * 
 * 
 * 3.抽象类不能够实例化,必须依赖子类完成实例化。
 * 子类继承抽象父类，必须实现抽象父类的抽象方法，否则子类还是一个抽象父类
 * 
 * @author lenovo
 * 
 */

public  abstract  class Base
{

	//静态块
	static
	{

	}
	
	//抽象类的构造函数的作用，完全给子类依赖（继承：子类的构造一定依赖父类的构造）
	Base(String  a)
	{
		
	}

	// 实例方法
	public void show()
	{

	}
	//抽象方法是用abstract来修饰的，没有方法体
	public  abstract  void  check();
}
