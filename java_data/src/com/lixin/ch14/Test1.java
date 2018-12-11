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
		//set集合过滤重复的条件就是:hasCode和equals
		set.add(s1);
		set.add(s2);

		// set认为是重复对象
		System.out.println("set集合的大小为:" + set.size());

		System.out.println("-----------------------");

		HashSet set1 = new HashSet();
		Stu stu1 = new Stu(20, "王启明11");

		Stu stu2 = new Stu(20, "王启明");
		
	
		//即使hascode值相同，也不代表是同一个对象，还需判断equals()
		System.out.println("stu1-->"+stu1.hashCode()+"\tstu2-->"+stu2.hashCode());

		set1.add(stu1);
		set1.add(stu2);
		System.out.println("set1集合的大小为:" + set1.size());

	}

}
