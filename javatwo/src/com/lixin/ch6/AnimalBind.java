package com.lixin.ch6;

public class AnimalBind
{
	
	public void  exec(Animal  an)
	{
		if(an  instanceof  Cat)
		{
			System.out.println("����һֻ�ɰ���è");
		}
		else
		{
			System.out.println("����һ�����õĹ�");
		}
	}

}
