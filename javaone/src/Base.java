public class Base
{

	String name;

	Base()
	{

	}

	Base(String name)
	{
		// 构造函数初始化赋值
		this.name = name;
	}

	public static void add(int a, int b)
	{
		System.out.println(a + b);

	}

	public  String add(int a, String b)
	{
		return a + b;
	}

	public static void main(String[] args)
	{
		// 构造函数总是和创建对象一起被执行，是隐式的，自动的和new创建对象调用
		Base b1 = new Base();
		System.out.println(b1.name);

		Base b2 = new Base("李欣");
		System.out.println(b2.name);
		
		b1.add(10, 20);
	}

}
