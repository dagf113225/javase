package com.lixin.ch12;

import java.util.ArrayList;
import java.util.Iterator;

//ArrayList�ײ���������ʵ��,�����ȽϿ죬�����ɾ���Ƚ���
public class Test
{
	
	public static void main(String[] args)
	{
		
		//Collection�ӿ��µ��ӽӿ�List��Set�ӿ�
	
		//1.ʵ��List�ӿڵ�����������ģ������ظ���.
		//1.List�ӿڵĵ�һ��ʵ���������ArrayList���ײ�����������ʵ�ֵ�.
		
//		Collection c1 = new ArrayList();
//		
//		List c2 = new ArrayList();
		
		
		ArrayList  lists  = new ArrayList();
		
		//�������ݵķ���  add();
		lists.add("1");
		lists.add("one");
		lists.add(true);
		lists.add(20.0);
		lists.add('c');
		lists.add("1");
		
		System.out.println(lists.size());
		
		//�������	ArrayList�е�����
		for(int i=0;i<lists.size();i++)
		{
			System.out.println("�����е�ÿ��Ԫ��Ϊ:-->"+lists.get(i));
		}
		System.out.println("-------------------------");
		//��������
		//�õ�һ��������
		Iterator  its=lists.iterator();
		
		while(its.hasNext())//�������������û��Ԫ����
		{
			
			System.out.println("ÿһ��Ԫ��:"+its.next());
			
		}
		
		
		
		
		//2.ʵ��Set�ӿڵ�����������ģ��������ظ���.
	}

}
