package com.lixin.ch20;

public class Stu  implements Comparable
{
	
	public Stu(int age, String name)
	{
		super();
		this.age = age;
		this.name = name;
	}

	private  int  age;
	
	public String name;

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public int compareTo(Object o)
	{
		// TODO Auto-generated method stub
		return this.age-((Stu)o).age;
	}

}
