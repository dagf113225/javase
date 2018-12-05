package com.lixin.lesson18;

public class UserOperatorThread  extends Thread
{
	
	private  Bank  bank;
	
	private double  opmoney;
	
	public  UserOperatorThread(String  threadName,Bank  bank,double  opmoney)
	{
		//设置线程的名字
		this.setName(threadName);
		
		this.bank=bank;
		this.opmoney=opmoney;
	}
	
	public   void  run()
	{
		this.bank.operatoeMoney(opmoney);
	}

}
