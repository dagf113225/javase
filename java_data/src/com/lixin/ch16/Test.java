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
		lists.add("�ֻ�");
		lists.add("����");
		lists.add("����");
		//HashMap�̷߳ǰ�ȫ,,����ֵ����Ϊ��
		HashMap  hmap = new HashMap();
		hmap.put("1", "������");
		hmap.put(null, null);
		hmap.put("���������ﳵ", lists);
		
		System.out.println("HashMap-->"+hmap.size());
		
		
		//Hashtable�̰߳�ȫ,����ֵ������Ϊ��
		Hashtable  tmap = new Hashtable();
		tmap.put("2", "������");
		tmap.put(null, null);
		System.out.println("Hashtable-->"+tmap.size());
		
	}

}
