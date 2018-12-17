package com.lixin.lesson7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * NotSerializableException:û�����л��쳣
 * 
 * javaBeanû��ʵ�����л��ӿڣ�����ӿ������Ǳ�ע����������Զ�������ʽ�������
 * 
 * ���л�:�Ѷ����Զ�������ʽ�����
 * @author lenovo
 *
 */
public class Test
{

	public static void main(String[] args)
	{
		User u = new User();
		u.setNum(100);
		u.setName("����");
		u.setPwd("123456");
		ObjectOutputStream objOut = null;
		
		ObjectInputStream   in  = null;
		// ����д�뵽�ļ�
		try
		{
			//���л� ����-->�����Ƶ���ʽд��
			 objOut = new ObjectOutputStream(
					new FileOutputStream("./user.datas"));

			objOut.writeObject(u);
			
			//�����л������Ƶ���ʽ--����ȡ����
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
