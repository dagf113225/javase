package com.lixin.ch13;

//javaBean中的属性参照对应表的列字段信息
public class Depts
{
	
	private int  dnum;
	
	private String  dname;
	
	private String dphone;

	public int getDnum()
	{
		return dnum;
	}

	public void setDnum(int dnum)
	{
		this.dnum = dnum;
	}

	public String getDname()
	{
		return dname;
	}

	public void setDname(String dname)
	{
		this.dname = dname;
	}

	public String getDphone()
	{
		return dphone;
	}

	public void setDphone(String dphone)
	{
		this.dphone = dphone;
	}

}
