package com.lixin.ch12;

import java.util.LinkedList;

//List�ӿ��������ݽṹ�ص㣬�Ƚ��ȳ�
//LinedList����һ���ص�:�γ�ջ�����ݽṹ�ص㣬�Ƚ����
public class Test4
{

	public static void main(String[] args)
	{
		LinkedList  lists  = new LinkedList();
		
		//ѹջ
		lists.push(1);
		lists.push("one");
		lists.push(true);
		lists.push(20);
		
		//isEmpty�ж��Ƿ�Ϊ��
		while(!lists.isEmpty())
		{
			//��ջ
			System.out.println(lists.pop());
		}
		
	}
}
