package com.lixin.model1;
/**
 * ����ģʽ��java����һ����Ķ�����Զֻ�����������һ������
 * 
 * @author lenovo
 *
 */
public class Test
{
	public static void main(String[] args)
	{
//		SingleModel  sm1 = new SingleModel();
//		SingleModel  sm2 = new SingleModel();
//		
//		System.out.println(sm1);
//		System.out.println(sm2);
		
		SingleModel  s1=SingleModel.getInstance();
		SingleModel  s2=SingleModel.getInstance();
		System.out.println(s1);
		System.out.println(s2);
	}

}
