package com.lixin.lesson1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

//����Ŀ¼
public class Test
{
	
	static  List<String>  txtLists  = new ArrayList<String>();
	
	static  List<String>  pptLists  = new ArrayList<String>();
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
//				String  endFileName=fileName.substring(fileName.lastIndexOf("."));
//				
//				if(endFileName.equals(".txt"))
//				{
//					txtLists.add(fileName);
//					
//				}
				
				if(fileName.endsWith(".txt"))
				{
					txtLists.add(fileName);
				}
				
				if(fileName.endsWith(".ppt"))
				{
					pptLists.add(fileName);
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
		//����aaĿ¼�µ��ļ�
		File  f  = new File("d://aa");
		Test  t = new Test();
		t.serchFile(f);
		
		System.out.println("txt�ļ�������Ϊ:"+Test.txtLists.size());
		System.out.println("ppt�ļ�������Ϊ:"+Test.pptLists.size());
		
	
		
	}

}
