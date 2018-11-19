package com.lixin.ch1;

public class Stu  extends Person
{

	Stu(String name, int age)
	{
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void content()
	{
		// TODO Auto-generated method stub
		System.out.println(this.name+",学生说,我的年龄是:"+this.age);
	}
	


	

}
