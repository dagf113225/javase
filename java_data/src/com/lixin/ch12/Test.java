package com.lixin.ch12;

import java.util.ArrayList;
import java.util.Iterator;

//ArrayList底层是用数组实现,遍历比较快，插入或删除比较慢
public class Test
{
	
	public static void main(String[] args)
	{
		
		//Collection接口下的子接口List和Set接口
	
		//1.实现List接口的子类是有序的，可以重复的.
		//1.List接口的第一个实现子类叫做ArrayList，底层是用数组来实现的.
		
//		Collection c1 = new ArrayList();
//		
//		List c2 = new ArrayList();
		
		
		ArrayList  lists  = new ArrayList();
		
		//放入数据的方法  add();
		lists.add("1");
		lists.add("one");
		lists.add(true);
		lists.add(20.0);
		lists.add('c');
		lists.add("1");
		
		System.out.println(lists.size());
		
		//遍历这个	ArrayList中的数据
		for(int i=0;i<lists.size();i++)
		{
			System.out.println("集合中的每个元素为:-->"+lists.get(i));
		}
		System.out.println("-------------------------");
		//迭代遍历
		//得到一个迭代器
		Iterator  its=lists.iterator();
		
		while(its.hasNext())//这个迭代器中有没有元素了
		{
			
			System.out.println("每一个元素:"+its.next());
			
		}
		
		
		
		
		//2.实现Set接口的子类是无序的，不可以重复的.
	}

}
