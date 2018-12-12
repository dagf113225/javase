package com.lixin.ch20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3
{
	public static void main(String[] args)
	{

		// Collection接口
		// Collections类,是个集合的工具类
		// Collection和Collections区别?

		List<String> lists = new ArrayList<String>();
		lists.add("1");
		lists.add("5");
		lists.add("9");
		lists.add("0");
		lists.add("2");

		// Collections.sort(lists);
		Collections.reverse(lists);

		for (String s : lists)
		{
			System.out.println(s);
		}
		System.out.println("-------------------");

		Collections.sort(lists);//0,1,2,5,9
		//折半查找必须首先排序
		int index = Collections.binarySearch(lists, "9");
		System.out.println("index-->" + index);

	}
}
