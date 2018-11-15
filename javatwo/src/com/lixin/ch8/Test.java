package com.lixin.ch8;

public class Test
{
	
	public static void main(String[] args)
	{
		//一个父类对象指向子类
//		Person p = new Stu();
//		p.eat();
		
		Person p1 = new Emp();
	    p1.eat();
	    
	    //动态绑定  一个父类对象指向多个子类现象
	    /**
	     * 在继承关系中，子类继承父类，
	     * 
	     * 子类和父类具有相同的方法名，相同的参数列表[相同参数个数，相同的参数类型],
	     * 相同的返回值类型，我们称为方法重写，又叫做方法覆盖.
	     * 
	     * 决定调用哪个重写的方法，是由new的那个对象，来决定执行那个对象的方法。
	     * 
	     * 因为new对象是在运行期间创建的，所以我们又把方法重写叫做：运行时多态
	     * 
	     *  方法重写，子类重写父类的方法，子类方法的访问修饰一定
	     *  要大于或等于父类的重写的方法访问修饰符
	     *  
	     *  // 访问修饰符
	     *  public protected default  private 
	     *  
	     *  父类的重写的方法的访问修饰符至少是default
	     * 
	     * 
	     * 
	     * 
	     */
	}

}
