package com.lixin.ch11;

//这个DeptsJavaBean描述了表的t_depts表 的列的信息
public class Depts
{
	
	//部门编号
	private  int  dnum;
	
	
	//部门名称
	private String deptname;
	
	
	//部门手机
	private String deptphone;


	public int getDnum()
	{
		return dnum;
	}


	public void setDnum(int dnum)
	{
		this.dnum = dnum;
	}


	public String getDeptname()
	{
		return deptname;
	}


	public void setDeptname(String deptname)
	{
		this.deptname = deptname;
	}


	public String getDeptphone()
	{
		return deptphone;
	}


	public void setDeptphone(String deptphone)
	{
		this.deptphone = deptphone;
	}
	
	

}
