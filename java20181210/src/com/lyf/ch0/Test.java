package com.lyf.ch0;

public class Test
{
	//�������͵ı�����ʼֵ   ȫ�ֱ�����false
	boolean  flag;
	
	public  void  show()
	{
		if(!flag)
		{
			System.out.println(flag);//���ʲô?
		}
	}
	
	public static void main(String[] args)
	{
		Test  t  =new  Test();
		System.out.println(t.flag);
		System.out.println(!t.flag);
	    t.show();
	}

}
