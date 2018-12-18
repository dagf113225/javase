package com.lixin.ch2;

import java.io.FileReader;
import java.util.Hashtable;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ParseDBConfig
{
	
	private static  ParseDBConfig  dbParse;
	
	private DBBean  dbBean;
	
	private Hashtable<String,String> sqltables;
	
	public  DBBean  getDbBean()
	{
		return  this.dbBean;
	}
	
	private  ParseDBConfig(String  dbName)
	{
		System.out.println("-----------解析配置文件开始--------------------");
		dbBean  = new DBBean();
		try
		{
			//解析完成解析xml文件的内容
			SAXReader saxReader = new SAXReader();
			Document doc = null;

			doc = saxReader.read(new FileReader("./src/db_" + dbName + ".xml"));
			Element rootElement = doc.getRootElement();
			String  driver = rootElement.element("conn").elementTextTrim("driver");

			System.out.println("driver-->" + driver);

			String  url = rootElement.element("conn").elementTextTrim("url");

			System.out.println("url-->" + url);

			String username = rootElement.element("conn").elementTextTrim("username");

			System.out.println("username-->" + username);

			String password = rootElement.element("conn").elementTextTrim("password");

			System.out.println("password-->" + password);
			
			dbBean.setDriver(driver);
			dbBean.setUrl(url);
			dbBean.setUsername(username);
			dbBean.setUserpwd(password);
			
			parseSql(doc);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("-----------解析配置文件end--------------------");
		
	}
	private void  parseSql(Document doc)
	{
		sqltables = new Hashtable<String,String>();
		
		List<Element>  lists=doc.selectNodes("dbs/sqls/sql");
		
		for(Element  element:lists)
		{
			System.out.println(element.getName());
			String  keyName=element.element("name").getTextTrim();
			String  keyValue=element.element("value").getTextTrim();
			
			System.out.println(keyName+"-->"+keyValue);
			
			sqltables.put(keyName, keyValue);
		}
		
	}
	public  static  ParseDBConfig  getInstance(String  dbName)
	{
		synchronized (ParseDBConfig.class)
		{
			if(null==dbParse)
			{
				dbParse  = new ParseDBConfig(dbName);
			}
			
		}
		
		return dbParse;
	}

	public Hashtable<String, String> getSqltables()
	{
		return sqltables;
	}

	public void setSqltables(Hashtable<String, String> sqltables)
	{
		this.sqltables = sqltables;
	}

}
