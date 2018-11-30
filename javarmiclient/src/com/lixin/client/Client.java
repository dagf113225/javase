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
			// 1.去远程服务上查找RMI服务
			IDataService dataservice = (IDataService) Naming
					.lookup("rmi://192.168.43.69:8200/dataservice");

			// 2.dataservice去调用远程方法
			int count = dataservice.getCount("t_stus");

			System.out.println("远程访问的结果为:" + count);
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
			// 1.去远程服务上查找RMI服务
			IDataService dataservice = (IDataService) Naming
					.lookup("rmi://192.168.43.69:8200/dataservice");

			// 2.dataservice去调用远程方法
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
