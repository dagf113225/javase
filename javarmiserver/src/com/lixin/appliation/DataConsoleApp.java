package com.lixin.appliation;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import com.lixin.dao.impl.UserDataServiceImpl;
import com.lixin.dao.interfaces.IDataService;

public class DataConsoleApp
{
	public static void main(String[] args)
	{
		System.out.println("远程数据访问服务接口启动......");

		try
		{
			// 1.首先声明这个远程服务对象
			IDataService dataService = new UserDataServiceImpl();

			// 2.在本地注册这个服务的端口
			LocateRegistry.createRegistry(8200);

			// 3.去绑定这个RMI服务
			Naming.bind("rmi://127.0.0.1:8200/dataservice", dataService);
		}
		catch (RemoteException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (AlreadyBoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
