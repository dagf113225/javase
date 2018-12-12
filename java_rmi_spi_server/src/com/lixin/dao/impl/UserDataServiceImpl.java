package com.lixin.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;
import java.util.ServiceLoader;

import com.lixin.dao.db.interfaces.DB;
import com.lixin.dao.interfaces.IDataService;


//2.实现这个远程方法的接口

//实现的rmi接口的类必须再继承rmi 必须继承UnicastRemoteObject
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

		//只能访问mysql数据库
		//DB db = new DB();
		
		//用户对数据库的产品需求是不一样的，oracle,mysql,怎么用最小的开销满足用户的需求呢?
		
		DB  db  = null;
		//服务发现DB接口的实现类MysqlDBImpl,OracleDBImpl
		ServiceLoader<DB>  dbServices=ServiceLoader.load(DB.class);
		Iterator<DB>  its=dbServices.iterator();
		
		while(its.hasNext())
		{
			db=its.next();
		}

		return db.getCount(tableName);
	}
	

}
