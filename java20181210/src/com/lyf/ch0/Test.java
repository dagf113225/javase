package com.lyf.ch0;

public class Test
{
	//布尔类型的变量初始值   全局变量，false
	boolean  flag;
	
	public  void  show()
	{
		if(!flag)
		{
			System.out.println(flag);//输出什么?
		}
	}
	
	public static void main(String[] args)
	{
		Test  t  =new  Test();
		System.out.println(t.flag);
		System.out.println(!t.flag);
	    t.show();
	}

}
