package com.lixin.ch14;

public class Stu  implements Comparable
{

	public Stu(int age, String name)
	{
		super();
		this.age = age;
		this.name = name;
	}

	private int age;

	private String name;
	
	private  int  snum;
	
	public Stu(int age, String name,int snum)
	{
		super();
		this.age = age;
		this.name = name;
		this.snum=snum;
	}

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
	public int hashCode()
	{
		// TODO Auto-generated method stub
		//王启明20  王启明20  王启明22
		//return (this.name+this.age).hashCode();
		return 10;
	}

	@Override
	public boolean equals(Object obj)
	{
		// TODO Auto-generated method stub
		if (this == obj)
		{
			return true;
		}
		else if (obj instanceof Stu)
		{
			Stu s = (Stu) obj;

			//return this.name.equals(s.name);
			//return this.name.equals(s.name);
			return  this.age==s.age;
		}
		else
		{
			return false;
		}
	}

	//排序方法
	@Override
	public int compareTo(Object o)
	{
		// TODO Auto-generated method stub
		//排序规则需要你去写
		Stu s=(Stu)o;
		//return s.age-this.age; //1,升序this.age-s.age ；2.降序 s.age-this.age
		return s.snum-this.snum;
	}

	public int getSnum()
	{
		return snum;
	}

	public void setSnum(int snum)
	{
		this.snum = snum;
	}

}
