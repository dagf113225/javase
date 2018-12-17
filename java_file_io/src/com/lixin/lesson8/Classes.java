package com.lixin.lesson8;

public class Classes   implements java.io.Serializable
{
    private  int  cid;
    
    private String  cname;
    
    private String  caddress;
    
    private String  cqq;

	public int getCid()
	{
		return cid;
	}

	public void setCid(int cid)
	{
		this.cid = cid;
	}

	public String getCname()
	{
		return cname;
	}

	public void setCname(String cname)
	{
		this.cname = cname;
	}

	public String getCaddress()
	{
		return caddress;
	}

	public void setCaddress(String caddress)
	{
		this.caddress = caddress;
	}

	public String getCqq()
	{
		return cqq;
	}

	public void setCqq(String cqq)
	{
		this.cqq = cqq;
	}
}
