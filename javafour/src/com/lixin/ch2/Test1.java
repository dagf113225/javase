package com.lixin.ch2;

public class Test1
{
	
	public static void main(String[] args)
	{
		//接口不能实例化
		//Driver  c = new Driver();
		
		Driver  c  = new Compu();
		c= new Phone();
		
		
		c.LoadUSB();
	}

}
