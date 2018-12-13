package com.lixin.lesson1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

//遍历目录
public class Test
{
	
	static  List<String>  txtLists  = new ArrayList<String>();
	
	static  List<String>  pptLists  = new ArrayList<String>();
	//递归算法，自己调用自己
	public   void  serchFile(File f)
	{
		//f这个文件对象表示了aa这个目录
		File[]  fs=f.listFiles();
		
		for(File  fa:fs)
		{
			//如果是文件的话，带后缀名就打印文件名
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
				
				System.out.println("下面所有的文件名称为:"+fileName);
			}
			else
			{
				System.out.println("这个是目录:"+fa.getName());
				serchFile(fa);//自己调用自己
			}
			
		}
	}
	
	
	public static void main(String[] args)
	{
		//查找aa目录下的文件
		File  f  = new File("d://aa");
		Test  t = new Test();
		t.serchFile(f);
		
		System.out.println("txt文件的数量为:"+Test.txtLists.size());
		System.out.println("ppt文件的数量为:"+Test.pptLists.size());
		
	
		
	}

}
