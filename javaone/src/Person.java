//面向对象的特征1.封装
//1.封装  对类中的属性私有的设置private，这样不能够直接访问类中的
//私有的变量，提高数据访问的安全性，怎么样
//才能访问类中的私有的属性呢?
//对类中的私有的属性进行方法的设置(set/get|属性名，首字母大写)
//通过方法来进行对数据的访问，通过方法我们对设置者，数据进行安全控制。
public class Person
{

	// 姓名 实例变量 非静态变量
	private  String name;

	// 年龄 实例变量 非静态变量
	 private int age;

	// 城市名称 不仅仅属于哪个个体的，而是属于所有对象的一个属性
	// 属于整个Person类的
	// 静态变量 类变量
	static String cityName;

	// 在java里面通过set和get方法来进行数据访问，
	// 提高数据访问的安全性,
	// 方法的访问修饰符都定义为public 公开 的
	// 设置值
	public void setAge(int age)
	{
		if (age > 0 && age <= 450)
		{
			// this表示的是当前对象,谁调用这个方法，this就是谁
			this.age = age;
		}
		else
		{
			System.out.println("对不起你的年龄不合法");
		}

	}

	// 获取值
	public int getAge()
	{
		if (this.age > 0 && this.age <= 450)
		{
			// this表示的是当前对象,谁调用这个方法，this就是谁
			return this.age;
		}
		else
		{
			return 0;

		}
	}

	public void setName(String name)
	{

		this.name = name;
	}

	public String getName()
	{

		return this.name;
	}

	// //入口函数
	// public static void main(String[] args)
	// {
	// //对实例变量的访问，就是访问值或是设置值
	// //必须首先创建这个类的对象
	// //Person是这个创建对象的模板
	// Person p1 = new Person();
	// System.out.println(p1.name+","+p1.age);
	//
	// //赋值，设置值
	// p1.name="袁信莉";
	// p1.age=18;
	// System.out.println(p1.name+","+p1.age);
	//
	// p1.cityName="南京市";
	// //静态变量也叫做类变量，建议大家今后采用类名.静态变量名
	// Person.cityName="石头城";
	//
	// cityName="健康市";
	//
	// //ctrl+m 最大化
	// System.out.println(p1.name+","+p1.age+",城市名为:"+p1.cityName);
	//
	// Person p2 = new Person();
	// System.out.println(p2.name+","+p2.age+",城市名为:"+p2.cityName);
	//
	// //引用类型赋值，实际是把这个对象的地址赋值
	// p2 = p1;
	// System.out.println(p2.name+","+p2.age+",城市名为:"+
	// p2.cityName);
	//
	//
	//
	// }

}
