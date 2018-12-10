package com.lixin.ch12;

import java.util.LinkedList;

//List接口有序，数据结构特点，先进先出
//LinedList还有一个特点:形成栈的数据结构特点，先进后出
public class Test4
{

	public static void main(String[] args)
	{
		LinkedList  lists  = new LinkedList();
		
		//压栈
		lists.push(1);
		lists.push("one");
		lists.push(true);
		lists.push(20);
		
		//isEmpty判断是否为空
		while(!lists.isEmpty())
		{
			//出栈
			System.out.println(lists.pop());
		}
		
	}
}
