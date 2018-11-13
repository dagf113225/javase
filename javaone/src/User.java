
//一个类的生命周期

public class User
{

	static
	{
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
		//main方法是入口，按照顺序执行
		
		//创建一个对象  1.构造代码块先执行，构造函数再执行。
		//2.构造代码块会随着对象的创建反复执行。
		//User  u = new User();
		//System.out.println("------------------------");
		//User  u1 = new User();
		
		
		//静态代码块会最先执行,并且只执行一次。
		User  u = new User();
		User  u1 = new User();
		
	}
	
	

}
