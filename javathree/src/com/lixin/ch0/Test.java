package com.lixin.ch0;

public  class Test
{
	//整个应用程序入口
	public static void main(String[] args)
	{
		//访问Employee类中的属性和方法
		//创建这个类的对象
		Employee  emp = new Employee();
		//访问属性  属于直接访问属性，但是不安全，可以对属性的值进行
		//没有控制的设置值。
	    //emp.name="钱涛";
		//emp.age=20;
		//类中的属性private ,不能够直接访问
		
		//间接访问，通过方法进行数据的访问，为什么就提高了安全性呢?
	}

}
