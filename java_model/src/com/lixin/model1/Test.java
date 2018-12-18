package com.lixin.model1;
/**
 * 单例模式，java创建一个类的对象永远只能生成这个类一个对象。
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
