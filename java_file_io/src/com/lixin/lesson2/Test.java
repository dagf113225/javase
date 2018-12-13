package com.lixin.lesson2;

import java.io.File;

public class Test
{
	
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
				
				//删除txt文件
				if(fileName.endsWith(".txt"))
				{
					System.out.println("删除的文件名为 :"+fileName);
					fa.delete();
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
		File  f  = new File("d://aa");
		Test  t = new Test();
		t.serchFile(f);
	}

}
