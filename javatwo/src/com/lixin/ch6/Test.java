package com.lixin.ch6;

import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		System.out.println("�����û�����Ҫʲô����?");
		
		Scanner s = new Scanner(System.in);
		String  name=s.next();
		
		Animal  an= null;
		
		if(name.equals("��"))
		{
			an = new Dog();
		}
		else  if(name.equals("è"))
		{
			an = new Cat();
		}
		AnimalBind  ab = new AnimalBind();
		ab.exec(an);
	}

}
