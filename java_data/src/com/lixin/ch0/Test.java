package com.lixin.ch0;

public class Test
{
	
	public static void main(String[] args)
	{
		//����һ�����͵�����
		//��������ʱ�򣬱��������䳤��
		//��̬��ʼ����new �������飬����Ҫ�г���
		int[]  as = new int[5];
		
		as[0]=1111;
		System.out.println(as[0]);
		
		System.out.println(as[4]);
		
		System.out.println(as[as.length-1]);
		
		
		//��̬��ʼ��  �����Ѿ������ˣ���ʵ����ʽ
		String[]   ss={"������","����","20"};
		
		System.out.println(ss[ss.length-1]);
		
		System.out.println("--------------------");
		
		//ss[3]="�����";
		
		System.out.println(ss[ss.length-1]);
		
		//��ͳ����  ������[�±�]
//		for(int i=0;i<ss.length;i++)
//		{
//			System.out.println(ss[i]);
//		}
		System.out.println("---------------------------------------");
		
		
		//foreach���� ע��jdk�ı��뻷��  JDK1.5��ע�⿴һ��eclipse���뻷��
		for(String s:ss)
		{
			System.out.println("---s:"+s);
		}
		
		
		
//		String  s1="123";
//		System.out.println(s1.length());
	}

}
