package com.lixin.lesson5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * http://zhangmenshiting.qianqian.com/data2/music/33e2
 * b01d165a6d1ae094aa178ed775ad
 * /610370686/610370676129600128.mp3?xcode=4cd7aa3d37a735dfb74cd3784244547c
 * 
 * @author lenovo
 * 
 */
public class Test3
{

	public static void main(String[] args)
	{
		String str = "http://zhangmenshiting.qianqian.com/data2/music/33e2b01d165a6d1ae094aa178ed775ad/610370686/610370676129600128.mp3?xcode=4cd7aa3d37a735dfb74cd3784244547c";

		FileOutputStream out = null;
		InputStream in = null;
		try
		{
			// File 表示的是本地文件路径
			// URL:表示的网络路径 ,http//,https://
			URL url = new URL(str);

			// 打开网络路径
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			if (conn.getResponseCode() == HttpURLConnection.HTTP_OK)
			{
				System.out.println("打开网络路径是成功的");

				// 获取这个路径的输入流
				in = conn.getInputStream();

				System.out.println("in-->" + in);

				File f = new File("./baidumusic/a111.mp3");

				if (!f.getParentFile().exists())
				{
					f.getParentFile().mkdirs();
				}
				long startTime = System.currentTimeMillis();
				out = new FileOutputStream(f);

				int len = 0;
				byte[]   buffer  = new byte[2*2014];
//				while ((len = in.read()) != -1)
//				{
//					out.write(len);
//				}
				
				while ((len = in.read(buffer)) != -1)
				{
					out.write(buffer);
				}
				long endTime = System.currentTimeMillis();

				System.out.println("读取音乐文件的时间为:" + (endTime - startTime));
			}
			else
			{
				System.out.println("打开网络路径是失败的");
			}
		}
		catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if (null != out)
			{
				try
				{
					out.close();
				}
				catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (null != in)
			{
				try
				{
					in.close();
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
