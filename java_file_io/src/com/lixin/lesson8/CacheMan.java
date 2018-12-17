package com.lixin.lesson8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CacheMan
{

	// cachedataĿ¼/�������.data �����ļ�
	File f = null;

	List<Map<String, Object>> lists = null;

	public List<Map<String, Object>> controllerCache(String tableName)
	{
		f = new File("./cachedata" + "/" + tableName + ".data");
		
		if (!f.getParentFile().exists())
		{

			System.out.println("û�����Ŀ¼��û���������");

			System.out.println("ȥ���ݿ��ѯ");
			callDB(tableName);
		}
		else
		{
			System.out.println("ȥ����Ŀ¼�±�����û����������ļ�****");

			// 1.�������������ļ���ֱ�Ӵӻ����ļ��ж�ȡ����
			File[] fs = f.getParentFile().listFiles();
			
			List<String>  fileLists  = new ArrayList<String>();
			
            for(File  ff:fs)
            {
            	fileLists.add(ff.getName());
            }
            
            if(fileLists.contains(tableName+".data"))
            {
            	System.out.println("����Ŀ¼������������ļ�");
            	ObjectInputStream in =null;
				try
				{
					in = new ObjectInputStream(new FileInputStream(f));
					lists = (List<Map<String, Object>>) in.readObject();
					
					
				}
				catch (FileNotFoundException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (ClassNotFoundException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
            }
            else
            {
            	System.out.println("����Ŀ¼��û����������ļ���Ҫȥ���ݿ��ѯ");
            	callDB(tableName);
            }
            
		}
		return lists;
	}

	public void callDB(String tableName)
	{
		DB db = new DB();
		lists = db.queryDatas(tableName);
		if (!f.getParentFile().exists())
		{
			// ��������Ŀ¼
			f.getParentFile().mkdirs();
		}

		try
		{
			// ���������
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream(f));

			out.writeObject(lists);
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
