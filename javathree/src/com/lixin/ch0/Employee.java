package com.lixin.ch0;

import java.util.Date;

//java�Ǹ���������������  class 
//javascript�ǻ��ں������������  function

/**
 * һ����:��ɲ���:��̬�飬�����飬���캯����ʵ����������̬������ʵ����������̬����
 * ������������:1.��װ  ���������ݣ���������ݷ��ʵİ�ȫ�ԡ�
 * 2.�̳�  �����ظ��Ĵ���  ���ඨ��Ĺ�ͬ�����Ժͷ���  ��������ȡ
 * 
 * 3.��̬  ͬһ������������ͬ�ı�����ʽ����ͬ�ı��ֽ����
 *  ����:���캯�����أ��������أ����ֵķ�Χ:һ������
 *  
 * @author lenovo
 *
 */
public class Employee
{
	//������ļ���(main�����ŵ�λ��),ִֻ��һ��*************
	static
	{
		System.out.println("Employee��̬��.............");
		
		
	}
	
	public  Employee()
	{
		System.out.println("--------Employee���캯��--------");
	} 
	
	//���캯��������1.����ʽ�Զ���new ��������һ��ִ��
	//2.�����е����Խ��г�ʼ������ֵ
	//this����ǰ����˭���ô���˭�����ǲ��ܾ�̬������ʹ��this
	public Employee(String name,int age)
	{
		System.out.println("--------Employee���캯��start--------");
		
		this.name=name;
		this.age=age;
		
		System.out.println("--------Employee���캯��end--------");
	}
	
	//����
	private String name;
	
	
	//����
	private int  age;
	
	{
		System.out.println("11111111");
	}
	
	{
		System.out.println("2222222");
	}


	public String getName()
	{
		return name;
	}
	
	public  static  void  work()
	{
		
	}
	public static  int  work(String task)
	{
		
		return 0;
	}


	public void setName(String name)
	{
		System.out.println(new Date()+",��������������....start...");
		
		this.name = name;
		
		System.out.println(new Date()+",��������������....end...");
	}


	public int getAge()
	{
		return age;
	}


	public void setAge(int age)
	{
		this.age = age;
	}


}
