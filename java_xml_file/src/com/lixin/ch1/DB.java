package com.lixin.ch1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

//����ģʽ��һ�Է���ֻ��һ������
public class DB
{

	static String driver;
	static String url;
	static String username;
	static String password;

	private Connection conn;
	static
	{
		Properties p = new Properties();

		try
		{
			p.load(new FileReader(new File("./src/checkdb.properties")));

			String dbname = p.getProperty("dbname");

			System.out.println("dbname-->" + dbname);

			SAXReader saxReader = new SAXReader();
			Document doc = null;

			doc = saxReader.read(new FileReader("./src/db_" + dbname + ".xml"));
			Element rootElement = doc.getRootElement();
			driver = rootElement.element("conn").elementTextTrim("driver");

			System.out.println("driver-->" + driver);

			url = rootElement.element("conn").elementTextTrim("url");

			System.out.println("url-->" + url);

			username = rootElement.element("conn").elementTextTrim("username");

			System.out.println("username-->" + username);

			password = rootElement.element("conn").elementTextTrim("password");

			System.out.println("password-->" + password);
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (DocumentException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{

		}
	}

	public DB()
	{

		try
		{
			Class.forName(driver);

			conn = DriverManager.getConnection(url, username, password);
			System.out.println("���ݿ����ӳɹ�" + conn);
		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args)
	{

		// System.out.println("��������Ҫʲô�������ݿ�?");
		//
		// Scanner s = new Scanner(System.in);
		//
		// String dbName=s.next();

		DB db1 = new DB();

	}

}
