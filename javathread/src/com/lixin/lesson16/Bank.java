package com.lixin.lesson16;

public class Bank
{
	//���п���
	private String cardNum;
	
	//���е��˻����
	private double  money;
	
	//��������˻��ĳ�ʼ��
	public  Bank(String cardNum,double  money)
	{
		
		this.cardNum=cardNum;
		this.money=money;
		
	}
	
	public void   operatoeMoney(double  opmoney)
	{
		System.out.println(Thread.currentThread().getName()+",��ӭ������������....");
		
		//��ȡ��
		this.money+=opmoney;
		//��ӡ�����ص�
		System.out.println(Thread.currentThread().getName()+"," +
				"�����Ľ��Ϊ:"+opmoney+
				",���ڵ��˻������Ϊ:"+this.money);
		
		
		System.out.println(Thread.currentThread().getName()+"," +
				"лл��Ĳ�������ӭ�´�����....");
	}
	
	

}
