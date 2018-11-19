package com.lixin.ch0;

//一个类继承一个抽象类，一定要实现抽象类中的抽象方法
public   class Son  extends  Base
{
	
	public  Son()
	{
		super("");
	}

	@Override
	public void check()
	{
		// TODO Auto-generated method stub
		System.out.println("Son类的check方法");
	}

	

}
