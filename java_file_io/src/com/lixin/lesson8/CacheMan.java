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

	// cachedata目录/表的名称.data 缓存文件
	File f = null;

	List<Map<String, Object>> lists = null;

	public List<Map<String, Object>> controllerCache(String tableName)
	{
		f = new File("./cachedata" + "/" + tableName + ".data");
		
		if (!f.getParentFile().exists())
		{

			System.out.println("没有这个目录，没有这个缓存");

			System.out.println("去数据库查询");
			callDB(tableName);
		}
		else
		{
			System.out.println("去缓存目录下遍历有没有这个缓存文件****");

			// 1.如果有这个缓存文件，直接从缓存文件中读取数据
			File[] fs = f.getParentFile().listFiles();
			
			List<String>  fileLists  = new ArrayList<String>();
			
            for(File  ff:fs)
            {
            	fileLists.add(ff.getName());
            }
            
            if(fileLists.contains(tableName+".data"))
            {
            	System.out.println("缓存目录下有这个缓存文件");
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
            	System.out.println("缓存目录下没有这个缓存文件，要去数据库查询");
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
			// 创建缓存目录
			f.getParentFile().mkdirs();
		}

		try
		{
			// 对象输出流
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
