
public class Dog
{
	//狗的颜色
	String  colorName;
	
	//狗喜欢吃骨头 ,所有的狗都喜欢吃骨头，所以设置成静态
	//静态方法也叫做类方法
	public static  void  eat()
	{
		System.out.println("狗喜欢吃骨头");
	}
	
	//实例方法，实例就是一个对象
	public void  setColorName(String colorName)
	{
	    //每个狗的颜色对每个狗对象不一样
		this.colorName=colorName;
	}
	
	public  String  getColorName()
	{
		return  this.colorName;
	}
	
	

}
