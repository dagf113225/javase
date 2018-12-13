package com.lixin.lesson4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class Test
{
	
	/**
	 * 
	 * 北冥神功   ：无崖子--输出》虚竹 
	 * 吸星大法: 丁春秋--输入> 江湖上的人
	 * 1.Java流，
	 * 
	 * 输入流  我们电脑从百度服务器上下载音乐
	 * 输出流  我们电脑上传文件到服务器
	 * 
	 *  文件的类型:
	 *  1.文本文件 ----------------》字符流 输入字符流，输出字符流
	 *  2.二进制文件 ---------------->字节流  输入字节流，输出字节流
	 * 
	 * Java JDK1.4之前只有一个流，字节流，可以读取文本文件，也可以读取二进制文件。
	 * java为了提升读取文本文件的性能，又开辟了字符流，专门用来读取文本文件，不能读取二进制文件。
	 * 
	 * 介绍个经验
	 * Stream 结束的，就全部是字节流
	 * Reader或Writer 结束的,就全部是字符流.
	 * 
	 * 首先我们在做项目的时候，选用什么流:
	 * Buffered 带有缓冲区的流，优先使用。
	 * 
	 * 
	 */
	/**
	 * 
	 * 1.这个文件的类型是什么?
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
//			//不等于-1，就是这个文件没有读完
//			while((len=freader.read())!=-1)
//			{
//				System.out.print((char)len);
//				
//			}
			
			//读取文本文件，使用字符流，使用缓冲字符流
			//FileReader转换成缓冲字符流？？？
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
