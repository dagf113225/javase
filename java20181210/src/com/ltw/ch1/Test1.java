package com.ltw.ch1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1
{
	//Ϊʲô����ArrayList����������List
	//�Ӷ�̬�󶨵ĽǶȣ����Կ���������ͨ���Եõ������
	public void  s(List   lists)
	{
		
	}

	public static void main(String[] args)
	{
		A  a  = null;
		
		a=  new B();
		a= new C();
		
		
		List  lists  = null;
		
		lists  = new ArrayList();
		lists = new LinkedList();
		
		Test1  t = new Test1();
		t.s( new ArrayList());
		t.s(new LinkedList());
		
		
	}
}
