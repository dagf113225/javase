package com.lixin.ch7;

public class Test2
{
	
	void  show()
	{
		try
		{
			Integer.parseInt("a");
		}
	
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
//		catch(NumberFormatException e)
//		{
//			e.printStackTrace();
//		}
	}

	public static void main(String[] args)
	{
		
	}
}
