package com.lixin.ch5;

public class PersonBind
{

	public void exec(Object p)// p=new Stu();p=new Emp();
	{
		// instanof运算符
		// 对象 instanof 类名 是:true;否：false

		if (p instanceof Stu)
		{
			Stu s = (Stu) p;
			System.out.println("这个学生:"+s.getName()+","+s.getScore());
		}
		else if (p instanceof Emp)
		{
			Emp e = (Emp) p;
			System.out.println("这个工人:"+e.getName()+","+e.getSalary());
		}
		

	}

}
