
//一个类的生命周期

public class User
{
	
	private  static  int  a=10;
	
	private int  b=20;

	static
	{
		
		//静态块中可以直接使用静态变量
		a=20;
		
		//静态块中不能够直接使用实例变量
		b=30;
		
		//静态块中访问实例变量，怎么办?
		User  u = new User();
		u.b=30;
		
		System.out.println("静态代码块");
	}
	
	User()
	{
		System.out.println("构造函数");
	}
	public  void  show()
	{
		System.out.println("这是实例方法show()");
	}
	public  static  void  check()
	{
		a=40;
		b=90;
		User  u = new User();
		u.b=30;
		System.out.println("这是静态方法check()");
	}
	
	{
		System.out.println("构造代码块2--------");
	}
	{
		System.out.println("构造代码块1***");
	}
	//入口函数
	public static void main(String[] args)
	{
		
		//类的生命周期:
		//1.main方法是入口，按照顺序执行
		//2.静态代码块是肯定最先执行，并只执行一次,不需要调用。
		//3.按照代码的顺序执行，创建对象时，如果有匿名代码块
		//。最先匿名代码块，再执行构造方法。
		//4.访问规则，静态块和静态方法可以直接访问静态变量，
		//不能够直接访问实例变量，如果要访问实例变量，必须
		//首先创建这个类的对象，才能访问实例变量。
		
		//创建一个对象  1.构造代码块先执行，构造函数再执行。
		//2.构造代码块会随着对象的创建反复执行。
		//User  u = new User();
		//System.out.println("------------------------");
		//User  u1 = new User();
		
		
		//静态代码块会最先执行,并且只执行一次。
		User.check();
//		User  u = new User();
//		User  u1 = new User();
		
	}
	
	

}
