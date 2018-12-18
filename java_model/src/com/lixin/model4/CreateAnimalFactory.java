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
		System.out.println("xml文件已经开始解析");
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

	// 工厂模式，根据名字（ 由用户的需求）来生产不同的对象.

	// 静态工厂
	public static Animal getFactory(String name) throws Exception
	{
		// Animal an = null;
		//
		// if (name.equals("狗"))
		// {
		// an = new Dog();
		// }
		// else if (name.equals("猫"))
		// {
		// an = new Cat();
		// }
		// //如果是新增加的需求，这个工厂类就使用面向对象完美的解决用户的解决。
		// return an;

		String classPath = objectMaps.get(name);
		Animal an = null;
		if (null == classPath || "".equals(classPath))
		{
			System.out.println(name + ",地区的名族特点，不能生产");
			throw new Exception("伊斯兰地区，请注意....");
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

	// 实例工厂

}
