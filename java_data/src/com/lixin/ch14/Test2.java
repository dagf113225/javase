package com.lixin.ch14;

import java.util.Iterator;
import java.util.TreeSet;

public class Test2
{
	
	public static void main(String[] args)
	{
		TreeSet  set  = new TreeSet();
//		set.add(4);
//		set.add(10);
//		set.add(5);
//		set.add(9);
//		set.add(9);
		
		set.add('c');
		set.add('f');
		set.add('y');
		set.add('a');
		set.add('b');
		
		Iterator  its=set.iterator();
		
		while(its.hasNext())
		{
			System.out.println(its.next());
		}
		
		
	}

}
