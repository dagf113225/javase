package com.lixin.ch12;

import java.util.Iterator;
import java.util.LinkedList;

////LinkedList底层是用双向链表实现,遍历比较慢，插入或删除比较快
public class Test1
{
	
	public static void main(String[] args)
	{
		//LinkedList也是List接口下的直接实现子类
		//有序可以重复
		LinkedList  lists  = new LinkedList();
		
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
	}

}
