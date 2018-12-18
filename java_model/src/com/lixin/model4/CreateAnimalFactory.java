package com.lixin.model4;

import java.util.Hashtable;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class CreateAnimalFactory
{
	static Hashtable<String, String> objectMaps = new Hashtable<String, String>();
	static
	{
		System.out.println("xml�ļ��Ѿ���ʼ����");
		SAXReader saxReader = new SAXReader();
		try
		{
			Document doc = saxReader.read("./src/com/lixin/model4/animal.xml");

			List<Element> lists = doc.selectNodes("animals/animal");

			for (Element element : lists)
			{
				String key = element.attributeValue("id");
				String value = element.attributeValue("class");

				objectMaps.put(key, value);
			}

		}
		catch (DocumentException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// ����ģʽ���������֣� ���û���������������ͬ�Ķ���.

	// ��̬����
	public static Animal getFactory(String name) throws Exception
	{
		// Animal an = null;
		//
		// if (name.equals("��"))
		// {
		// an = new Dog();
		// }
		// else if (name.equals("è"))
		// {
		// an = new Cat();
		// }
		// //����������ӵ���������������ʹ��������������Ľ���û��Ľ����
		// return an;

		String classPath = objectMaps.get(name);
		Animal an = null;
		if (null == classPath || "".equals(classPath))
		{
			System.out.println(name + ",�����������ص㣬��������");
			throw new Exception("��˹����������ע��....");
		}
		else
		{
			try
			{
				an = (Animal) Class.forName(classPath).newInstance();

			}
			catch (InstantiationException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IllegalAccessException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (ClassNotFoundException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return an;

	}

	// ʵ������

}
