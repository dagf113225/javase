package com.lixin.ch12;

import java.util.Iterator;
import java.util.LinkedList;

////LinkedList�ײ�����˫������ʵ��,�����Ƚ����������ɾ���ȽϿ�
public class Test1
{
	
	public static void main(String[] args)
	{
		//LinkedListҲ��List�ӿ��µ�ֱ��ʵ������
		//��������ظ�
		LinkedList  lists  = new LinkedList();
		
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
	}

}
