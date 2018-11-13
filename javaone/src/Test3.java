/**
 * Java面向对象特征，特点具体表现有:
 * 1.封装
 * 2.继承  子类和父类
 * 3.多态  多种表现形式，它的具体表现有2种:
 *   3.1 方法重载  构造重载是方法的一个特殊的表现
 *   3.2 方法重写，方法覆盖
 *   
 *   
 *   重载：在一个类中，相同的方法名，不同的实现结果，也就是表现结果。
 *        具体表现:构造函数重载和方法重载
 *        
 *        
 *        决定调用哪个重载的方法，是由谁决定的?
 *        是由参数列表决定的1.个数 2.类型  不同
 *        
 *        与返回值类型无关
 *        
 *        静态方法也是方法重载
 *        
 *        方法的重载叫做：编译时多态
 *   
 * 4.抽象
 * 
 *
 * 
 * 
 * 
 * 
 * @author lenovo
 *
 */
public class Test3
{
           
	public  String  add(int a,String b)
	{
		return a+b;
	}
	public  int  add(int a,int  b)
	{
		return a+b;
	}
	public  void  add(int a,double  b)
	{
		System.out.println(a+b);
	}
	
	public  static  int  change()
	{
		return  10;
	}
	public static void  change(int a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		Test3  t =  new Test3();
		int c=t.add(10,20);
		System.out.println(c);
		System.out.println("------------");
		t.add(10,"20");
		
		t.add(20,20.0);
		
		Test3.change();
		Test3.change(10);
	}
}
