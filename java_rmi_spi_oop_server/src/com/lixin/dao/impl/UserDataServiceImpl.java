package com.lixin.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;
import java.util.ServiceLoader;

import com.lixin.dao.db.interfaces.DB;
import com.lixin.dao.interfaces.IDataService;


//2.ʵ�����Զ�̷����Ľӿ�

//ʵ�ֵ�rmi�ӿڵ�������ټ̳�rmi ����̳�UnicastRemoteObject
public class UserDataServiceImpl extends UnicastRemoteObject implements
		IDataService
{

	public UserDataServiceImpl() throws RemoteException
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCount(String tableName) throws RemoteException
	{
		System.out.println("UserDataServiceImpl  is  getCount  start...");
		// TODO Auto-generated method stub

		//ֻ�ܷ���mysql���ݿ�
		//DB db = new DB();
		
		//�û������ݿ�Ĳ�Ʒ�����ǲ�һ���ģ�oracle,mysql,��ô����С�Ŀ��������û���������?
		
		DB  db  = null;
		//������DB�ӿڵ�ʵ����MysqlDBImpl,OracleDBImpl
		ServiceLoader<DB>  dbServices=ServiceLoader.load(DB.class);
		
		System.out.println("dbServices-->"+dbServices);
		
		Iterator  its=dbServices.iterator();
		
		System.out.println("its-->"+its.hasNext());
		
		while(its.hasNext())
		{
			System.out.println("***----->");
			db=(DB)its.next();
			System.out.println("db----->"+db);
		}

		return db.getCount(tableName);
	}
	

}
