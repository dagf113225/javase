package com.lixin.service.test;

import java.util.Iterator;
import  java.util.ServiceLoader;

import com.lixin.services.ISaveDatas;

public class Test
{
	
	public static void main(String[] args)
	{
		//��̬���أ�������(һ���������ָ�����࣬����������Ѿ�д����java������)
		
//		ISaveDatas sd = new DatabaseData();
//		sd.saveData();
		
		//��̬���أ������޸�java���룬�޸������ļ�������ģʽ�ﵽʹ�ö���Ĳ�ͬ
		
		//ServiceLoader���ֻ���ISaveDatas�ӿڵķ����ʵ����
		ServiceLoader<ISaveDatas>  serviceDatas=ServiceLoader.load(ISaveDatas.class);
		
		Iterator<ISaveDatas>  its=serviceDatas.iterator();
		ISaveDatas sd =null;
		
		while(its.hasNext())
		{
			//��̬�󶨣���˭�����������ļ����Ĳ��Զ���
			sd=its.next();
			sd.saveData();
			
		}
		
	}

}
