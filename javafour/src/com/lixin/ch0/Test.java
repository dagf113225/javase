package com.lixin.ch0;

public class Test
{
	
	public static void main(String[] args)
	{
		//������������󣬳������ǲ���ʵ����
		//Base  base  = new Base();
		
		//������һ�����������̳еģ�һ����������
		//��������һ�������������ʵ������
		
		Base  base = new Son();
		base  = new Gril();
		
		//����������þ���Ϊ����ǿ�̳У���̬�󶨣���̬(������д)
		base.check();
	}

}
