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
		System.out.println("Զ�����ݷ��ʷ���ӿ�����......");

		try
		{
			// 1.�����������Զ�̷������
			IDataService dataService = new UserDataServiceImpl();

			// 2.�ڱ���ע���������Ķ˿�
			LocateRegistry.createRegistry(8200);

			// 3.ȥ�����RMI����
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
