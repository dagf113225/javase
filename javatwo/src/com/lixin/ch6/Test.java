package com.lixin.ch6;

import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		System.out.println("请问用户你需要什么宠物?");
		
		Scanner s = new Scanner(System.in);
		String  name=s.next();
		
		Animal  an= null;
		
		if(name.equals("狗"))
		{
			an = new Dog();
		}
		else  if(name.equals("猫"))
		{
			an = new Cat();
		}
		AnimalBind  ab = new AnimalBind();
		ab.exec(an);
	}

}
