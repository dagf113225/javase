package com.lixin.ch1;

import com.lixin.ch0.Stu;

/**
 * 一个类讲完了.
 * 
 * 2个类，子类和父类，继承
 * 
 * 1.java中所有的类都是在包下。
 * 
 * 2.java中所有的类都是直接或间接继承Object类。
 * Object是java中的顶级类，也就是祖宗类。
 * 
 * java中所有的类都是继承的。
 * 
 * 隐式继承:没有写extends ,直接继承Object
 * 显示继承:写了extends 父类，直接单继承   只能有一个直接的爸爸
 * 
 * 为什么继承?
 * 
 *  减少重复代码冗余，[减少方法级代码冗余]
 * 
 * @author lenovo
 *
 */

public class Test   
{
	
	
	
	public static void main(String[] args)
	{
		Test  t = new  Test();
		System.out.println(t.hashCode());
		
		Test  t1 = new Test();
		//引用类型==，equals都是比较的是地址
		System.out.println(t.equals(t1));//false
		System.out.println(t==t1);
		
		System.out.println("-------------------------");
		//String是个引用类型，特殊:1.可以不new;2.String 类的equals 比较的是值
		String  s1 = new String("123");
		String  s2 = new String("123");
		//String 类的equals 比较的是值
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s2);
		System.out.println("-------------------------");

		
		StringBuffer  sb1 =  new StringBuffer("123");
		StringBuffer  sb2 =  new StringBuffer("123");
		System.out.println(sb1.equals(sb2));//false
		
		Stu  m1 = new Stu();
		Stu  m2= new Stu();
		System.out.println(m1.equals(m2));//
	}
	

}
