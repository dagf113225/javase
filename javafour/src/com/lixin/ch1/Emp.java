package com.lixin.ch1;

public class Emp  extends Person
{

	Emp(String name, int age)
	{
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void content()
	{
		// TODO Auto-generated method stub
		System.out.println(this.name+",����˵,�ҵ�������:"+this.age);
	}

}
