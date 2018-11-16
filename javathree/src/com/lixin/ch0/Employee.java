package com.lixin.ch0;

import java.util.Date;

//java是个基于类的面向对象  class 
//javascript是基于函数的面向对象  function

/**
 * 一个类:组成部分:静态块，匿名块，构造函数，实例方法，静态方法，实例变量，静态变量
 * 面向对象的特征:1.封装  保护了数据，提高了数据访问的安全性。
 * 2.继承  减少重复的代码  子类定义的共同的属性和方法  方法级抽取
 * 
 * 3.多态  同一个方法名，不同的表现形式，不同的表现结果。
 *  具体:构造函数重载，方法重载，体现的范围:一个类中
 *  
 * @author lenovo
 *
 */
public class Employee
{
	//随着类的加载(main函数放的位置),只执行一次*************
	static
	{
		System.out.println("Employee静态块.............");
		
		
	}
	
	public  Employee()
	{
		System.out.println("--------Employee构造函数--------");
	} 
	
	//构造函数的作用1.是隐式自动和new 创建对象一起被执行
	//2.对类中的属性进行初始化设置值
	//this代表当前对象，谁调用代表谁，但是不能静态方法中使用this
	public Employee(String name,int age)
	{
		System.out.println("--------Employee构造函数start--------");
		
		this.name=name;
		this.age=age;
		
		System.out.println("--------Employee构造函数end--------");
	}
	
	//姓名
	private String name;
	
	
	//年龄
	private int  age;
	
	{
		System.out.println("11111111");
	}
	
	{
		System.out.println("2222222");
	}


	public String getName()
	{
		return name;
	}
	
	public  static  void  work()
	{
		
	}
	public static  int  work(String task)
	{
		
		return 0;
	}


	public void setName(String name)
	{
		System.out.println(new Date()+",进行姓名的设置....start...");
		
		this.name = name;
		
		System.out.println(new Date()+",进行姓名的设置....end...");
	}


	public int getAge()
	{
		return age;
	}


	public void setAge(int age)
	{
		this.age = age;
	}


}
