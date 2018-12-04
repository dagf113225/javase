package com.lixin.lesson12;

import com.lixin.lesson11.UserRunn;

public class Test
{
	public static void main(String[] args)
	{
		UserThread  u1 = new UserThread();
		UserThread  u2 = new UserThread();
	
		
		u1.start();
		u2.start();
	}
}
