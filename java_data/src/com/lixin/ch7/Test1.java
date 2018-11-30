package com.lixin.ch7;

public class Test1
{
	
	int   show()
	{
		
		try
		{
			Integer.parseInt("a");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return  10;
		}
		finally
		{
			System.out.println("---------");
		}
		return  20;
		
	}
	
	public static void main(String[] args)
	{
		Test1  t1 =  new Test1();
		int a=t1.show();
		System.out.println("a--->"+a);
	}

}
