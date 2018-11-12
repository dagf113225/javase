
public class Cat
{
	//猫的名字
	private String  name;
	
	//猫的颜色
	private String color;
	
	public  void  showCatInfo()
	{
		//this表示当前对象，表示，谁调用this就代表谁
		System.out.println(this.name+",颜色为:"+this.color);
	}
	
	public static  void  show()
	{
		System.out.println(this.name+",颜色为:"+this.color);
	}
	
	public static void main(String[] args)
	{
		Cat  c1 = new Cat();
		c1.name="小花";
		c1.color="黄色";
		
		c1.showCatInfo();
		System.out.println("-------------------------");
		
		Cat  c2 = new Cat();
		c2.name="大黑";
		c2.color="黑色";
		c2.showCatInfo();
		
		//this是不能用在静态方法中
	
		
	}

}
