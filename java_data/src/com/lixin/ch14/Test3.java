package com.lixin.ch14;

import java.util.Iterator;
import java.util.TreeSet;

public class Test3
{
	
	public static void main(String[] args)
	{
		Stu s1=new Stu(20,"ÍõÆôÃ÷",120);
		Stu s2=new Stu(22,"ÀîĞÀ",110);
		Stu s3=new Stu(18,"ÁõÑà·ï",109);
		Stu s4=new Stu(21,"Ëïæ¼",130);
		Stu s5=new Stu(25,"ÍõÈğ",100);
		TreeSet  set  = new TreeSet();
		
		//HashSet  set = new HashSet();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		Iterator  its=set.iterator();
		
		while(its.hasNext())
		{
			Stu s=(Stu)its.next();
			
			System.out.println(s.getName()+"\t"+s.getAge()+"\t"+s.getSnum());
		}
	}

}
