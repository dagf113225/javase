package com.lixin.ch6;

public class AnimalBind
{
	
	public void  exec(Animal  an)
	{
		if(an  instanceof  Cat)
		{
			System.out.println("这是一只可爱的猫");
		}
		else
		{
			System.out.println("这是一个活泼的狗");
		}
	}

}
