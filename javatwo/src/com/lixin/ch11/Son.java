package com.lixin.ch11;

public class Son extends Base
{
	//����͸��ඨ����ͬ���ı��������ཫ���ټ̳и����ͬ�����������Զ�����
	int  a;
	
	static  int  b;

	Son()
	{
		
		a = 2;
		b = 2;
	}

	public void addA()
	{
		a += 6;
	}
	public static void addB()
	{
		b += 7;
	}
	public static void main(String[] args)
	{
		
		Son  son = new Son();
		
		System.out.println("����:"+son.a+"---"+son.b);
		
		Base  base =son;
		
		System.out.println("����:"+base.a+"---"+base.b);
		
		System.out.println("----------------------");
		
		base.addA();
		System.out.println(son.a+","+son.b+","+base.a+","+base.b);//8,2,1,1
		
		base.addB();
		System.out.println(son.a+","+son.b+","+base.a+","+base.b);//8,2,1,6
	}

}
