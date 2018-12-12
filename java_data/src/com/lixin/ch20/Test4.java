package com.lixin.ch20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test4
{
	
	public static void main(String[] args)
	{
		List<Stu>  lists  = new ArrayList<Stu>();
		
		Stu  s1  =new Stu(18,"孙婕");
		Stu  s2  =new Stu(20,"王启明");
		Stu  s3  =new Stu(5,"王安乐");
		
		lists.add(s1);
		lists.add(s2);
		lists.add(s3);
		
		Collections.sort(lists);
		
		for(Stu s:lists)
		{
			System.out.println(s.getName()+"-->"+s.getAge());
		}
	}

}
