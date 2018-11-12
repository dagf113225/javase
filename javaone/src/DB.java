
public class DB
{ 
	
	String  host;
	
	String  username;
	
	String  userpwd;
	
	String  url;

    public void  display()
    {
    	System.out.println("-----display()--------");
    }
	//构造函数
    //构造函数作用:给类中的属性进行初始化赋值
    public DB(String  host,String  username,String  userpwd,String  url)
    {
    	
    	this.host=host;
    	this.username=username;
    	this.userpwd=userpwd;
    	this.url=url;
    	
    	
    	System.out.println("--------------这是有参数的DB的构造函数");
    } 
    
     DB()
    {
    	 	
     	System.out.println("************这是没有参数的DB的构造函数");
    }
    
    //实例方法，不是构造方法
    int  DB()
    {
    	return  0;
    }
    public static void main(String[] args)
	{
    	
    	//1.一个类中如果没有提供任何的构造函数，
    	//java编译器会隐式自动提供一个没有参数的构造函数
    	//给创建对象使用。
    	//2.如果一个类中提供了构造函数，创建对象必须依赖这个构造函数。
    	
		//创建对象
    	
    	//如果一个类有多个构造函数，那么就给创建对象提供了多个访问机制。
    	
    	//多个构造函数形成了重载---->同一个方法名，不同的实现结果。
    	//DB  db  = new DB("127.0.0.1","student","student","jdbc");
    	
    	DB  db1 = new DB();
    //	db.DB();
    	
    	
    	//db.display();
	}
}
