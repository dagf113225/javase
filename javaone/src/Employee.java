
public class Employee
{
    //姓名
	 String name;
	
	//年龄
	int  age;
	
	//工资
	float  salary;
	
	//入口函数
	public static void main(String[] args)
	{
		
		
	 
		//现在要给员工类的**员工对象进行属性赋值，首先要创建员工类的对象
		//创建了员工甲对象
		Employee 员工甲 = new Employee();
		
		Employee 员工呆子 = new Employee();
		
		System.out.println( 员工甲==员工呆子);
		
		Employee 员工a=员工甲;
		
		System.out.println( 员工甲==员工a);
		
		//给员工的属性赋值
		
		
	}
}
