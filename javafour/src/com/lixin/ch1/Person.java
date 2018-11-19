package com.lixin.ch1;

//抽象类，还是具备抽取子类的共有的属性和方法
public  abstract  class Person
{
	//姓名
	String  name;
	
	//年龄
	int age;
	
	
	Person(String  name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public   void  say()
	{
		this.content();
	}
	
	public  abstract  void  content();
	
   
}
