package com.lixin.model1;

public class SingleModel
{

	// 懒汉式单例 懒-->在需要的时候才想到调用你
	// 恶汉式单例 恶-->不管你需不需要，我都存在
	// static SingleModel sn = new SingleModel();
	static SingleModel sn;

	// 阉割 1.构造函数私有，目的，是在外部不能new这个类的对象
	private SingleModel()
	{

	}

	public static SingleModel getInstance()
	{
		if (null == sn)
		{
			sn = new SingleModel();
		}

		return sn;
	}

}
