package com.lixin.lesson4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class Test
{
	
	/**
	 * 
	 * ��ڤ��   ��������--��������� 
	 * ���Ǵ�: ������--����> �����ϵ���
	 * 1.Java����
	 * 
	 * ������  ���ǵ��ԴӰٶȷ���������������
	 * �����  ���ǵ����ϴ��ļ���������
	 * 
	 *  �ļ�������:
	 *  1.�ı��ļ� ----------------���ַ��� �����ַ���������ַ���
	 *  2.�������ļ� ---------------->�ֽ���  �����ֽ���������ֽ���
	 * 
	 * Java JDK1.4֮ǰֻ��һ�������ֽ��������Զ�ȡ�ı��ļ���Ҳ���Զ�ȡ�������ļ���
	 * javaΪ��������ȡ�ı��ļ������ܣ��ֿ������ַ�����ר��������ȡ�ı��ļ������ܶ�ȡ�������ļ���
	 * 
	 * ���ܸ�����
	 * Stream �����ģ���ȫ�����ֽ���
	 * Reader��Writer ������,��ȫ�����ַ���.
	 * 
	 * ��������������Ŀ��ʱ��ѡ��ʲô��:
	 * Buffered ���л���������������ʹ�á�
	 * 
	 * 
	 */
	/**
	 * 
	 * 1.����ļ���������ʲô?
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args)
	{
		try
		{
			FileReader freader = new FileReader("./src/com/lixin/lesson3/ExecAction.java");
			
//			int  len=0;
//			
//			//������-1����������ļ�û�ж���
//			while((len=freader.read())!=-1)
//			{
//				System.out.print((char)len);
//				
//			}
			
			//��ȡ�ı��ļ���ʹ���ַ�����ʹ�û����ַ���
			//FileReaderת���ɻ����ַ���������
			BufferedReader  br  =new BufferedReader(freader);
			
			String  line ="";
			
			int  count=0;
			while((line=br.readLine())!=null)
			{
				if(line.length()==0)
				{
					System.out.println("-->"+line.length());
					continue;
				}
				count++;
			
			}
			
			System.out.println("count-->"+count);
			
			
			
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
