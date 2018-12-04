package com.lixin.lesson8;

public class Test
{
    public static void main(String[] args)
	{
//    	UserThread  u1 =  new UserThread();
//    	UserThread  u2=  new UserThread();
//    	
//    	u1.start();
//    	u2.start();
//    	
    	
    	UserThread1  u3=  new UserThread1();
    	UserThread1  u4=  new UserThread1();
    	
    	u3.start();
    	u4.start();
	}
}
