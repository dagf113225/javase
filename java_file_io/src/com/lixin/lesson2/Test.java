package com.lixin.lesson2;

import java.io.File;

public class Test
{
	
	//�ݹ��㷨���Լ������Լ�
	public   void  serchFile(File f)
	{
		//f����ļ������ʾ��aa���Ŀ¼
		File[]  fs=f.listFiles();
		
		for(File  fa:fs)
		{
			//������ļ��Ļ�������׺���ʹ�ӡ�ļ���
			if(fa.isFile())
			{
				String  fileName=fa.getName();
				
				//ɾ��txt�ļ�
				if(fileName.endsWith(".txt"))
				{
					System.out.println("ɾ�����ļ���Ϊ :"+fileName);
					fa.delete();
				}

				
				System.out.println("�������е��ļ�����Ϊ:"+fileName);
			}
			else
			{
				System.out.println("�����Ŀ¼:"+fa.getName());
				serchFile(fa);//�Լ������Լ�
			}
			
		}
	}
	
	public static void main(String[] args)
	{
		File  f  = new File("d://aa");
		Test  t = new Test();
		t.serchFile(f);
	}

}
