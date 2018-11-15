package com.lixin.ch4;

public class Test
{
	
	public static void main(String[] args)
	{
		//引用类型转换  父类  子类 继承 
		//向上类型转换，向下类型转换
		
		//Object  obj  = new Object();
		
		//产生了一个子类对象
		Emp  emp = new Emp();
		System.out.println(emp.getAge());
		
		//把一个子类对象赋值给父类对象，子类转父类，向上转型
		//直接转换
		Person  p =emp;
		System.out.println(p.getAge());
		
		System.out.println("----------------------");
		
		//向下转型
		Object  obj = new Object();
		//把一个父类赋值给一个子类类型，父类转子类，向下转型
		//不能直接转换 ,强制转换 (目标类型)
		
		if(obj  instanceof  Person)
		{
			//想使用子类的方法
			Person  p1 =(Person)obj;
			System.out.println(p1.getAge());
		}
		else
		{
			System.out.println("不能转换....");
		}

		
//		//父类指向子类
//		Object  obj = new Person();
//		//现在父类想使用子类的方法
//		 
//		Person p2=(Person)obj;
//		System.out.println(p2.getAge());
		
		
	
	}

}
