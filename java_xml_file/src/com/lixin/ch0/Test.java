package com.lixin.ch0;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Test
{

	public static void main(String[] args)
	{
		// 1.����Dom4j�Ľ���������
		SAXReader saxReader = new SAXReader();

		try
		{
			// 2.ȥ��ȡxml����ļ�
			Document doc = saxReader.read(new File("./stus.xml"));

			// 3.��Ԫ��
			Element rootElement = doc.getRootElement();

			System.out.println(rootElement.getName());

			String id = rootElement.element("stu").attributeValue("id");
			System.out.println("id--->" + id);

			String name = rootElement.element("stu").elementTextTrim("name");
			System.out.println("name--->" + name);

			String age = rootElement.element("stu").elementTextTrim("age");
			System.out.println("age--->" + age);

			System.out.println("----------����·������  end-----------");

			System.out.println("----------����·��ѭ������·������  start-----------");
			List<Element> lists = doc.selectNodes("root/stu");
			
			for(Element  currentElement:lists)
			{
				System.out.println("currentElement-->"+currentElement.getName());
				
				String id1 = currentElement.attributeValue("id");
				System.out.println("id1--->" + id1);

				String name1 = currentElement.elementTextTrim("name");
				System.out.println("name1--->" + name1);

				String age1 = currentElement.elementTextTrim("age");
				System.out.println("age1--->" + age1);

			}

		}
		catch (DocumentException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
