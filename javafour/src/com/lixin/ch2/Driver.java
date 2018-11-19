package com.lixin.ch2;

//接口的关键字interface，接口就是一个特殊的类
//特殊:1.接口中的所有方法都是抽象方法,接口中没有构造函数;
//2.接口是不能实例化，也必须依赖子类完成实例化。
//3.接口中定义的所谓的变量,其实都是常量。final 修饰类，修饰变量，修饰变量

//接口是父类，就是被子类继承，关键字不是extends ,implements 
public interface Driver
{
    public final int  USB_WIDTH=15;
    
    public final int  USB_HEIGHT=5;

	public   void LoadUSB();
	
	

}
