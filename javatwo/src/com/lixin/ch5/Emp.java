package com.lixin.ch5;

//JAVA是个单继承，只能直接有一个父类，可以有多个间接的父类
public class Emp extends Person
{
	
	//工资
	double  salary;

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

}
