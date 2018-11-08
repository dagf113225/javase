
//这是员工类
public class EmpOne
{  
	
	//员工姓名 隐式 ：作用域 全局
	//实例变量，实例化对象才能访问的变量
	String  name;
	
	boolean  flag;
	
	double  money;
	
	//哪些变量定义成静态变量，哪些变量定义成实例变量
	//静态变量
	//我们有多少个职工
	static  int  count;
	
	//单位名字
	static String  dname;
	
	//方法(关键字  void，没有返回值;具体类型  有返回值)
	  void  empEat()
	{
		name="刘燕凤";
	}
	//main方法是个特殊的方法，static关键字，静态修饰方法

	public static void main(String[] args)
	{
		//static方法是不能够直接使用类的全局实例变量
		// name="刘冬孝";
		System.out.println("1-->"+count);
		
		//在main方法中，对实例变量的访问，必须首先创建对象
		
		 //实例化对象
		 EmpOne  o1 = new EmpOne();
		//String的默认值是:null
		System.out.println(o1.name+","+o1.flag);
		
		o1.name="陈赵梅";
		o1.money=20.008;
		o1.dname="巴斯夫";
		
		count++;
		
		
		EmpOne  d1 = new EmpOne();
		//String的默认值是:null
		System.out.println(d1.name+","+o1.flag);
		d1.name="袁信莉";
		d1.money=5000.99;

		
		count++;
		
		System.out.println("现在员工的数量是:"+count);
		
		o1.dname="扬子巴斯夫";
		System.out.println(o1.name+"-->"+o1.dname);
		System.out.println(d1.name+"-->"+d1.dname);
		
		
	}
	
	
	

}
