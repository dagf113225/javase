package com.lixin.lesson28;

public class User  implements  java.io.Serializable
{
	
	private String name;
	
	
	private String  pwd;


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
