package com.lixin.lesson7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * NotSerializableException:没有序列化异常
 * 
 * javaBean没有实现序列化接口，这个接口作用是标注把这个对象以二进制形式输入输出
 * 
 * 序列化:把对象以二进制形式的输出
 * @author lenovo
 *
 */
public class Test
{

	public static void main(String[] args)
	{
		User u = new User();
		u.setNum(100);
		u.setName("李欣");
		u.setPwd("123456");
		ObjectOutputStream objOut = null;
		
		ObjectInputStream   in  = null;
		// 对象写入到文件
		try
		{
			//序列化 对象-->二进制的形式写入
			 objOut = new ObjectOutputStream(
					new FileOutputStream("./user.datas"));

			objOut.writeObject(u);
			
			//反序列化二进制的形式--》读取对象
			in=new ObjectInputStream(new FileInputStream("./user.datas"));
			
			User  u1=(User)in.readObject();
			
			System.out.println(u1.getName()+u1.getNum()+u1.getPwd());
			
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
		finally
		{
			if(null!=objOut)
			{
				try
				{
					objOut.close();
				}
				catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
