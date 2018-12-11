package com.lixin.ch15;

public class Students implements  Comparable
{
	private  int snum;
	
	private String sname;
	
	private String saddress;
	
	private  double  money;

	public int getSnum()
	{
		return snum;
	}

	public void setSnum(int snum)
	{
		this.snum = snum;
	}

	public String getSname()
	{
		return sname;
	}

	public void setSname(String sname)
	{
		this.sname = sname;
	}

	public String getSaddress()
	{
		return saddress;
	}

	public void setSaddress(String saddress)
	{
		this.saddress = saddress;
	}

	public double getMoney()
	{
		return money;
	}

	public void setMoney(double money)
	{
		this.money = money;
	}

	@Override
	public int compareTo(Object o)//ÅÅĞò·½·¨
	{
		// TODO Auto-generated method stub
		//return this.snum-((Students)o).snum;
		return (int)( this.money-((Students)o).money);
	}

}
