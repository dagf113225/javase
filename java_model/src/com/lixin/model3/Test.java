package com.lixin.model3;

import java.util.Scanner;

public class Test
{
	
	public static void main(String[] args)
	{
		System.out.println("�����û�ϲ��ʲô���Ķ���?");
		
		Scanner  s =  new Scanner(System.in);
		
		String  name=s.next();
		
		//����������û��������������û���Ҫ��ʵ�ʶ���
		Animal an=CreateAnimalFactory.getFactory(name);
		an.eat();
		
		Animal an1=CreateAnimalFactory.getFactory(name);
		an1.eat();
		
		System.out.println(an);
		System.out.println(an1);
	}

}
