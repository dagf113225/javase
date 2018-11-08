public class EmpTwo
{
	// 员工姓名
	String name;

	// 员工工资
	double salary;

	// 方法，通过方法进行业务的实现
	//实现加薪
	void addSalary()
	{
		// 增加的钱数 局部变量,作用域只能作用这个方法
		double addsal = 100;

		// 局部变量声明时，如果没有赋值，不会报错。
		// 在使用局部变量，局部变量一定要赋值。
		salary = salary + addsal;

		System.out.println("这个员工叫做" + name + ",加了" + addsal + ",现在的工资是:"
				+ salary);

	}

	// void show()
	// {
	// addsal=100;
	// salary=100;
	//
	// }

	// 入口方法
	public static void main(String[] args)
	{
		EmpTwo  s1 = new EmpTwo();
		s1.name="袁信莉";
		s1.salary=1000;
		
		//s1这个职工对象叫做袁信莉加薪
		s1.addSalary();
		
		EmpTwo  s2 = new EmpTwo();
		s2.name="陈赵梅";
		s2.salary=500;
		
		System.out.println(s2.name+",工资为:"+s2.salary);
		s2.addSalary();
	}

}
