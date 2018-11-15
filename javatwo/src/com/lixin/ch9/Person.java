package com.lixin.ch9;



public class Person
{
	// 父类的重写的方法的访问修饰符至少是default
	private  void eat()
	{
		System.out.println("人去吃...");
	}
	public static void main(String[] args)
	{
		Person p1 = new Emp();
	    p1.eat();
	}

}
