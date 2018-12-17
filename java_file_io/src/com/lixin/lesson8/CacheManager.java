package com.lixin.lesson8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

//������
public class CacheManager
{

	public static List<Classes> controllerCache(String tableName)
	{
		// cachedataĿ¼/�������.data �����ļ�
		File f = new File("./cachedata" + "/" + tableName + ".data");

		List<Classes> lists = null;
		if (!f.getParentFile().exists())
		{

			System.out.println("û�����Ŀ¼��û���������");

			System.out.println("ȥ���ݿ��ѯ");

			DB db = new DB();
			lists = db.queryClasses(tableName);

			// ��������Ŀ¼
			f.getParentFile().mkdirs();

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
		else
		{
			System.out.println("ȥ����Ŀ¼�±�����û����������ļ�");

			// 1.�������������ļ���ֱ�Ӵӻ����ļ��ж�ȡ����
			File[] fs = f.getParentFile().listFiles();

			for (File ff : fs)
			{
				String fileName = ff.getName();

				if (fileName.equals(tableName + ".data"))
				{
					System.out.println("����Ŀ¼�д�����������ļ�");

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
					// 2.1.���û����������ļ���ȥ���ݿ��ѯ
					System.out.println("�л���Ŀ¼��û�л����ļ���������");
				}
			}

			
		}
		return lists;
	}
}
