package com.lixin.ch2;

//为什么要继承？继承的作用是什么？ 减少重复代码
public class Person  
{
	//姓名
	String name;
	
	//年龄
	int  age;
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String  getName()
	{
		return  this.name;
	}

}
