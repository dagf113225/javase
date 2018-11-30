package com.lixin.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.lixin.dao.interfaces.IDataService;

public class Client
{

	public void getTableCount()
	{
		try
		{
			// 1.ȥԶ�̷����ϲ���RMI����
			IDataService dataservice = (IDataService) Naming
					.lookup("rmi://192.168.43.69:8200/dataservice");

			// 2.dataserviceȥ����Զ�̷���
			int count = dataservice.getCount("t_stus");

			System.out.println("Զ�̷��ʵĽ��Ϊ:" + count);
		}
		catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (RemoteException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (NotBoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**public void getTableInfo()
	{
		try
		{
			// 1.ȥԶ�̷����ϲ���RMI����
			IDataService dataservice = (IDataService) Naming
					.lookup("rmi://192.168.43.69:8200/dataservice");

			// 2.dataserviceȥ����Զ�̷���
			Object[][] datas = dataservice.getclassName();
			
			
			for(int i=0;i<datas.length;i++)
			{
				for(int  j=0;j<datas[i].length;j++)
				{
					System.out.print(datas[i][j]+"    ");
				}
				System.out.println("\n");
			}

		}
		catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (RemoteException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (NotBoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}**/

	public static void main(String[] args)
	{
		Client  c= new Client();
		c.getTableCount();
	}

}
