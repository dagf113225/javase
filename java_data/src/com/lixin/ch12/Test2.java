package com.lixin.ch12;

import java.util.LinkedList;
import java.util.List;

public class Test2
{
	//比较ArrayList和LinkedList区别?代码做白盒测试
	public  void   addDatas(List  list)
	{
		
		//开始时间的long
		long  startTime=System.currentTimeMillis();
		
		for(int  i=0;i<=100000;i++)
		{
			list.add(0, i);
		}
		
		////结束时间的long
		long  endTime=System.currentTimeMillis();
		
		System.out.println("插入的时间为:"+(endTime-startTime));
	}
	
	public  void  queryDatas(List  list)
	{
		for(int  i=0;i<=100000;i++)
		{
			list.add(0, i);
		}
		
		//开始时间的long
		long  startTime=System.currentTimeMillis();
		for(int  i=0;i<=100000;i++)
		{
		
			list.get(i);
		}
		long  endTime=System.currentTimeMillis();
		System.out.println("查询的时间为:"+(endTime-startTime));
	}
	
	public static void main(String[] args)
	{
		Test2  t = new Test2();
		
		//插入数据性能的对比
		//t.addDatas(new ArrayList());//287毫秒  1330毫秒
		//t.addDatas(new LinkedList());//14
		
		//查询数据性能的对比
		//t.queryDatas(new ArrayList());//0,1
		t.queryDatas(new LinkedList());//11792  112...
	}

}
