/**
 * 1.在Person类中自己访问自己 2.在另外一个类Manager去 访问Person类中的属性
 * 
 * 
 * @author lenovo
 * 
 */
public class Manager
{

	public static void main(String[] args)
	{
		// 在Manager类中去访问Person类中的属性

		Person p2 = new Person();
		p2.setAge(630);
		p2.setName("李欣");

		System.out.println("姓名为:" + p2.getName() + ",年龄为:" + p2.getAge());

		// 在外部类直接访问一个类的实例变量，缺乏安全感
		// p2.name="陈赵梅";
		// 直接给年龄设置值，数据安全吗? 不安全.
		// 怎么才能安全???呢 通过对属性的私有[private]的设置，这样
		// 提高了数据的访问安全性，不能够直接去访问，直接设置值。
		//p2.age=600;

		// 2.现在我要去访问私有的属性，怎么访问?怎么提高安全性

	//	System.out.println("姓名为:"+p2.name+",年龄为:"+p2.age);

		// 静态变量cityName是Person类
		Person.cityName = "建邺市";
	}

}
