package com.ltw.ch1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1
{
	//为什么不给ArrayList，而是声明List
	//从动态绑定的角度，可以看到方法的通用性得到了提高
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
