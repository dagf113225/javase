public class StuOne
{
	// 学生姓名
	String name;

	// 学生年龄
	byte age;

	// 学校名字
	static String schoolName;

	// 学生数量
	static int stuCount;

	public static void main(String[] args)
	{
		//静态方法可以直接使用静态变量
		schoolName="南京科技职业学院";
		
		//要访问这个类的实例变量，首先要创建这个类的实例对象
		StuOne  one  = new StuOne();
		one.name="王启明";
		one.age=20;
		System.out.println(one.schoolName);
		
		StuOne  two  = new StuOne();
		two.name="吴宝磊";
		two.age=19;
		System.out.println(two.schoolName);
		
		one.schoolName="南京科技大学";
		System.out.println(two.schoolName);
		
		
		

	}

}
