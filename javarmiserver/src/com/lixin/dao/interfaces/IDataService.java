package com.lixin.dao.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

//rmi:r:remote;m:method;i:invocation


//����̳�һ��Զ�̽ӿ� 1.Զ�̷����ı�׼�ӿ�
public interface IDataService extends Remote
{
	   //��ѯ�����ж��������ݣ�rmi�ӿ��еķ�����������RemoteException
       public  int   getCount(String  tableName)  throws  RemoteException;
}
