package com.lixin.dao.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

//rmi:r:remote;m:method;i:invocation


//必须继承一个远程接口 1.远程方法的标准接口
public interface IDataService extends Remote
{
	   //查询表中有多少条数据，rmi接口中的方法必须声明RemoteException
       public  int   getCount(String  tableName)  throws  RemoteException;
}
