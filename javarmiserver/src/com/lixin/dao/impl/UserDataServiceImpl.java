package com.lixin.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.lixin.dao.interfaces.IDataService;
import com.lixin.db.DB;

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

		//访问数据库
		DB db = new DB();
		int count = db.getCount(tableName);
		
		System.out.println("数据的结果为:" + count);

		return count;
	}

}
