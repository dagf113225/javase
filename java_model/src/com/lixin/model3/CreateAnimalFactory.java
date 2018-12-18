package com.lixin.model3;

public class CreateAnimalFactory
{

	// 工厂模式，根据名字（ 由用户的需求）来生产不同的对象.

	// 静态工厂
	public static Animal getFactory(String name)
	{
		Animal an = null;

		if (name.equals("狗"))
		{
			an = new Dog();
		}
		else if (name.equals("猫"))
		{
			an = new Cat();
		}
		//如果是新增加的需求，这个工厂类就不能使用面向对象
		//完美的解决用户的需求。
		return an;

	}

	// 实例工厂

}
