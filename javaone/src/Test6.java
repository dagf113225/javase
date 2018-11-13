public class Test6
{

	int a = 5;

	// void changeA(int a) // int a=a;
	// {
	// a = 20;
	// }
	void changeA(int a)
	{
		this.a = a;
	}

	void changeA(Test6 t)// Test6 t=t=new Test6();
	{
		t.a = 30;
	}

	void changeA(Test6 t, Test6 t1)
	{

		// 引用类型的赋值，就是改变这个对象的指向，就是把这个对象的地址付给这个对象。
		t = t1;
		t.a = 100;
	}

	public static void main(String[] args)
	{
		int a = 0;

		Test6 t = new Test6();// a=5
		System.out.println(t.a + "," + a);
		// 局部变量在使用时必须要付初始值
		// 就近原则
		 t.changeA(a);
		// t.changeA(t.a);
		// System.out.println(a);
		// System.out.println(t.a);

		t.changeA(t);

		System.out.println(a);// 0

		System.out.println(t.a);// 30

		Test6 t2 = new Test6();// 5,100
		t.changeA(t, t2);

		System.out.println(a);// 0

		System.out.println(t.a + "," + t2.a);//

	}

}
