package com.lixin.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.lixin.dao.interfaces.IDataService;
import com.lixin.db.DB;

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

		//�������ݿ�
		DB db = new DB();
		int count = db.getCount(tableName);
		
		System.out.println("���ݵĽ��Ϊ:" + count);

		return count;
	}

}
