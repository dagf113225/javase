package com.lixin.ch5;

public class Test
{
	public static void main(String[] args)
	{
		PersonBind  pb = new PersonBind();
		
		//方法的参数给了一个大类型，是不是最好，体现在灵活和包容
		//pb.exec传3个不同的对象，意味着这个方法。。。
		//意味pb.exec灵活，包容
		//pb.exec(new Stu());
		//pb.exec(new Emp());
		
		pb.exec(new Object());


	}
} 
