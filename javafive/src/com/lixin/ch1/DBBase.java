package com.lixin.ch1;

public abstract class DBBase
{
	// 驱动名字
	private  String className;

	// 连接url
	private String url;

	// 用户名
	private String username;

	// 密码
	private  String userpwd;

	public DBBase(String className, String url, String username, String userpwd)
	{

		this.className = className;
		this.url = url;
		this.username = username;
		this.userpwd = userpwd;
		
		
		
		
	} 
	
	public abstract  void  getConn();

	public String getClassName()
	{
		return className;
	}

	public void setClassName(String className)
	{
		this.className = className;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getUserpwd()
	{
		return userpwd;
	}

	public void setUserpwd(String userpwd)
	{
		this.userpwd = userpwd;
	} 

}
