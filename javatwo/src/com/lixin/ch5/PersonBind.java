package com.lixin.ch5;

public class PersonBind
{

	public void exec(Object p)// p=new Stu();p=new Emp();
	{
		// instanof�����
		// ���� instanof ���� ��:true;��false

		if (p instanceof Stu)
		{
			Stu s = (Stu) p;
			System.out.println("���ѧ��:"+s.getName()+","+s.getScore());
		}
		else if (p instanceof Emp)
		{
			Emp e = (Emp) p;
			System.out.println("�������:"+e.getName()+","+e.getSalary());
		}
		

	}

}
