package com.lixin.ch5;

public class Test
{
	public static void main(String[] args)
	{
		PersonBind  pb = new PersonBind();
		
		//�����Ĳ�������һ�������ͣ��ǲ�����ã����������Ͱ���
		//pb.exec��3����ͬ�Ķ�����ζ���������������
		//��ζpb.exec������
		//pb.exec(new Stu());
		//pb.exec(new Emp());
		
		pb.exec(new Object());


	}
} 
