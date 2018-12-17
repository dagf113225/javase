package com.lixin.lesson7;

public class User  implements  java.io.Serializable
{

	public int num;

	private String name;
	
	//这个属性不序列化,不需要保存值
	private  transient  String pwd;
	
	public int getNum()
	{
		return num;
	}
	public void setNum(int num)
	{
		this.num = num;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPwd()
	{
		return pwd;
	}
	public void setPwd(String pwd)
	{
		this.pwd = pwd;
	}
}
