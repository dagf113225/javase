package com.lixin.model3;

import java.util.Scanner;

public class Test
{
	
	public static void main(String[] args)
	{
		System.out.println("请问用户喜欢什么样的动物?");
		
		Scanner  s =  new Scanner(System.in);
		
		String  name=s.next();
		
		//工厂类根据用户的需求来配置用户需要的实际对象
		Animal an=CreateAnimalFactory.getFactory(name);
		an.eat();
		
		Animal an1=CreateAnimalFactory.getFactory(name);
		an1.eat();
		
		System.out.println(an);
		System.out.println(an1);
	}

}
