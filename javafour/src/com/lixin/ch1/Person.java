package com.lixin.ch1;

//�����࣬���Ǿ߱���ȡ����Ĺ��е����Ժͷ���
public  abstract  class Person
{
	//����
	String  name;
	
	//����
	int age;
	
	
	Person(String  name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public   void  say()
	{
		this.content();
	}
	
	public  abstract  void  content();
	
   
}
