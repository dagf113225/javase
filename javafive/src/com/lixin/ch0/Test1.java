package com.lixin.ch0;

public class Test1
{

	public static void main(String[] args)
	{
		Object obj = new Object();

		Test1 t = null;

		// ClassCastException ����ת���쳣
		if (obj instanceof Test1)
		{
			t = (Test1) obj;

			System.out.println(t);
		}
		else
		{
			System.out.println("����ת��");
		}

	}

}
