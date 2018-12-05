package com.lixin.lesson17;

public class Bank
{
	//银行卡号
	private String cardNum;
	
	//银行的账户余额
	private double  money;
	
	//完成银行账户的初始化
	public  Bank(String cardNum,double  money)
	{
		
		this.cardNum=cardNum;
		this.money=money;
		
	}
	
	//1.synchronized修饰方法，只是表示给这个方法进行加锁操作.
	//2.能够锁的住的条件或者说是前提，必须持有同一个对象的锁。
	public  synchronized void   operatoeMoney(double  opmoney)
	{
		System.out.println(Thread.currentThread().getName()+",欢迎光临中信银行....");
		
		//存取款
		this.money+=opmoney;
		//打印操作回单
		System.out.println(Thread.currentThread().getName()+"," +
				"操作的金额为:"+opmoney+
				",现在的账户的余额为:"+this.money);
		
		
		System.out.println(Thread.currentThread().getName()+"," +
				"谢谢你的操作，欢迎下次再来....");
	}
	
	

}
