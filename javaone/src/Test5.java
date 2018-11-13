public class Test5
{
	private int a = 5;

	void changeA(int a)
	{
		System.out.println("changeA-->"+a);
		a = 10;
		//this.a=10;
	}
	void  changeA(Test5 t)
	{
		t.a=20;
	}
	void changeC(Test5  t)//Test5  t=t;
	{
		System.out.println("-----------1111,"+t.a);
		
		Test5  t1 = new Test5();
		
		System.out.println(t1.a);//5
		
		//引用类型的赋值，实际是改变了这个对象的指向
		//t=t1;
		t1=t;
		
		
		t.a=50;
	}
	public static void main(String[] args)
	{
		Test5  t =  new Test5();
		System.out.println(t.a);
		t.changeA(t.a);
		System.out.println("1-->"+t.a);//5
		System.out.println("------------------");
		t.changeA(t);
		System.out.println("2-->"+t.a);
		System.out.println("------------------");
		t.changeC(t);
		System.out.println("3-->"+t.a);
	}

}
