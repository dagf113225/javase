package com.lixin.ch0;

//��̬��  һ������ָ��������
public class EmpBind
{

	private Employee emp;

	public EmpBind(Employee emp)
	{

	}

	// private Manager ma;
	//
	// public EmpBind(Manager ma)
	// {
	//
	// }
	public static void main(String[] args)
	{
		EmpBind eb = new EmpBind(new Manager());
		eb = new EmpBind(new Worker());
	}

}
