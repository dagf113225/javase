package com.lixin.ch4;

public class Test
{
	
	public static void main(String[] args)
	{
		//��������ת��  ����  ���� �̳� 
		//��������ת������������ת��
		
		//Object  obj  = new Object();
		
		//������һ���������
		Emp  emp = new Emp();
		System.out.println(emp.getAge());
		
		//��һ���������ֵ�������������ת���࣬����ת��
		//ֱ��ת��
		Person  p =emp;
		System.out.println(p.getAge());
		
		System.out.println("----------------------");
		
		//����ת��
		Object  obj = new Object();
		//��һ�����ำֵ��һ���������ͣ�����ת���࣬����ת��
		//����ֱ��ת�� ,ǿ��ת�� (Ŀ������)
		
		if(obj  instanceof  Person)
		{
			//��ʹ������ķ���
			Person  p1 =(Person)obj;
			System.out.println(p1.getAge());
		}
		else
		{
			System.out.println("����ת��....");
		}

		
//		//����ָ������
//		Object  obj = new Person();
//		//���ڸ�����ʹ������ķ���
//		 
//		Person p2=(Person)obj;
//		System.out.println(p2.getAge());
		
		
	
	}

}
