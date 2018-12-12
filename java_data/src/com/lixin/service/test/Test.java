package com.lixin.service.test;

import java.util.Iterator;
import  java.util.ServiceLoader;

import com.lixin.services.ISaveDatas;

public class Test
{
	
	public static void main(String[] args)
	{
		//静态加载，绑定死了(一个父类对象指向子类，这个子类是已经写死在java代码中)
		
//		ISaveDatas sd = new DatabaseData();
//		sd.saveData();
		
		//动态加载，不会修改java代码，修改配置文件，策略模式达到使用对象的不同
		
		//ServiceLoader发现基于ISaveDatas接口的服务的实现类
		ServiceLoader<ISaveDatas>  serviceDatas=ServiceLoader.load(ISaveDatas.class);
		
		Iterator<ISaveDatas>  its=serviceDatas.iterator();
		ISaveDatas sd =null;
		
		while(its.hasNext())
		{
			//动态绑定，绑定谁，是由配置文件给的策略对象
			sd=its.next();
			sd.saveData();
			
		}
		
	}

}
