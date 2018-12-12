package com.lixin.ch20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lixin.ch14.Stu;

public class Test2
{

	public static void main(String[] args)
	{
		List<String> lists = new ArrayList<String>();
		lists.add("1");
		lists.add("22");
		lists.add("one");

		for (String s : lists)
		{
			System.out.println(s);
		}

		List<Stu> stulists = new ArrayList<Stu>();
		stulists.add(new Stu(20, "王安乐"));
		stulists.add(new Stu(18, "王启明"));

		for (Stu s : stulists)
		{

		}
		
		Map<String,Object>  maps  = new HashMap<String,Object>();
		
		List<Map<String,String>>  listsa = new ArrayList<Map<String,String>>();
		

	}

}
