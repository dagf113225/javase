
public class Test9
{
	
	int  a=5;
	
	boolean  flag;
	
	static  int  c;
	
	static
	{
		c=20;
	}
	
	int  getA()
	{
		int a=30;
		return a;
	}
	
	int  getA(int a)//a=10
	{
		a=8;
		//return a;
		return  this.a;
	}
	
	public static void main(String[] args)
	{
		
		int a=10;
		
		Test9  t1  = new Test9();
		System.out.println(t1.c);
		System.out.println(t1.a+","+t1.flag+","+a);
		
		System.out.println(t1.getA(a));
		
		Test9  t2  = new Test9();
		System.out.println(t2.a+","+t2.flag+","+a);
		
		t2.a=10;
		System.out.println(t2.getA(a)+","+t1.getA(100));//
		
		t1.c=300;
		System.out.println(t2.c);
	}

}
