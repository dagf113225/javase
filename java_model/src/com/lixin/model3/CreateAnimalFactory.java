package com.lixin.model3;

public class CreateAnimalFactory
{

	// ����ģʽ���������֣� ���û���������������ͬ�Ķ���.

	// ��̬����
	public static Animal getFactory(String name)
	{
		Animal an = null;

		if (name.equals("��"))
		{
			an = new Dog();
		}
		else if (name.equals("è"))
		{
			an = new Cat();
		}
		//����������ӵ��������������Ͳ���ʹ���������
		//�����Ľ���û�������
		return an;

	}

	// ʵ������

}
