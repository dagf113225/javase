package com.lixin.lesson8;

import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class Test
{
	public static void main(String[] args)
	{

	
		
		
		String s = Constan.CMENU_KEY;
		//截取
		String tableName = s.substring(0, s.indexOf(";"));

		System.out.println("tableName-->" + tableName);
		
		String  s1= Constan.CMENU_KEY.substring(s.indexOf(";")+1);
		
		System.out.println(s1);
		
		String[]  ss=s1.split(",");
		// "t_classes"

		// 查询的这个表第一次肯定到数据库，第二次，。后面我们不需要去数据库，去缓存
		List<Map<String, Object>> lists =new  CacheMan().controllerCache(tableName);

		// for(Classes c:lists)
		// {
		// System.out.println(c.getCname());
		// }
		
		
		for (int i = 0; i < lists.size(); i++)
		{
			Map map = (Map) lists.get(i);
			
			for(String  key:ss)
			{
				System.out.println(map.get(key));
			}
			//System.out.println(map.get("STUNAME"));
			
			
		}

	}
}
