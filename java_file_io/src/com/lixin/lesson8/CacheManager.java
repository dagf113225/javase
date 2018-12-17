package com.lixin.lesson8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

//缓存类
public class CacheManager
{

	public static List<Classes> controllerCache(String tableName)
	{
		// cachedata目录/表的名称.data 缓存文件
		File f = new File("./cachedata" + "/" + tableName + ".data");

		List<Classes> lists = null;
		if (!f.getParentFile().exists())
		{

			System.out.println("没有这个目录，没有这个缓存");

			System.out.println("去数据库查询");

			DB db = new DB();
			lists = db.queryClasses(tableName);

			// 创建缓存目录
			f.getParentFile().mkdirs();

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
		else
		{
			System.out.println("去缓存目录下遍历有没有这个缓存文件");

			// 1.如果有这个缓存文件，直接从缓存文件中读取数据
			File[] fs = f.getParentFile().listFiles();

			for (File ff : fs)
			{
				String fileName = ff.getName();

				if (fileName.equals(tableName + ".data"))
				{
					System.out.println("缓存目录中存在这个缓存文件");

					try
					{
						ObjectInputStream in = new ObjectInputStream(
								new FileInputStream(f));

						lists = (List<Classes>) in.readObject();
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
					// 2.1.如果没有这个缓存文件，去数据库查询
					System.out.println("有缓存目录，没有缓存文件。。。。");
				}
			}

			
		}
		return lists;
	}
}
