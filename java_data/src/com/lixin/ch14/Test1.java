package com.lixin.ch14;

import java.util.HashSet;

public class Test1
{

	public static void main(String[] args)
	{
		String s1 = new String("1235");
		String s2 = new String("1235");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()+"\t"+s2.hashCode());

		HashSet set = new HashSet();
		//set���Ϲ����ظ�����������:hasCode��equals
		set.add(s1);
		set.add(s2);

		// set��Ϊ���ظ�����
		System.out.println("set���ϵĴ�СΪ:" + set.size());

		System.out.println("-----------------------");

		HashSet set1 = new HashSet();
		Stu stu1 = new Stu(20, "������11");

		Stu stu2 = new Stu(20, "������");
		
	
		//��ʹhascodeֵ��ͬ��Ҳ��������ͬһ�����󣬻����ж�equals()
		System.out.println("stu1-->"+stu1.hashCode()+"\tstu2-->"+stu2.hashCode());

		set1.add(stu1);
		set1.add(stu2);
		System.out.println("set1���ϵĴ�СΪ:" + set1.size());

	}

}
