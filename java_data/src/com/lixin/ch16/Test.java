package com.lixin.ch16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class Test
{
	//[{},{},{}]
	public static void main(String[] args)
	{
		
		List  lists  =new ArrayList();
		lists.add("手机");
		lists.add("房子");
		lists.add("汽车");
		//HashMap线程非安全,,键和值都能为空
		HashMap  hmap = new HashMap();
		hmap.put("1", "王启明");
		hmap.put(null, null);
		hmap.put("王启明购物车", lists);
		
		System.out.println("HashMap-->"+hmap.size());
		
		
		//Hashtable线程安全,键和值都不能为空
		Hashtable  tmap = new Hashtable();
		tmap.put("2", "王启明");
		tmap.put(null, null);
		System.out.println("Hashtable-->"+tmap.size());
		
	}

}
