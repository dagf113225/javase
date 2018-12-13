package com.lixin.lesson4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test1
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader br = new BufferedReader(
					new FileReader("./datas.txt"));

			String line = "";

			while ((line = br.readLine()) != null)
			{
				//System.out.println(line);
				
				if((line.trim().length()<=1))
				{
					//System.out.println("空行.........");
					continue;
				}
				String[]  strs=line.split("\\|");
				
				System.out.println("strs-->"+strs.length);
				
				if(strs.length>2)
				{
					System.out.println("文件头");
					//javaBean
				}
				else
				{
					System.out.println("文件内容");
					//List<JavaBean>
				}
				
//				for(String  s:strs)
//				{
//					System.out.println(s);
//				}

				
			}

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
