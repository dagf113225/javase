package com.lixin.model2;

public class SingleModel
{

	// ����ʽ���� ��-->����Ҫ��ʱ����뵽������
	// ��ʽ���� ��-->�������費��Ҫ���Ҷ�����
	// static SingleModel sn = new SingleModel(); //��
	static SingleModel sn;// ��

	// �˸� 1.���캯��˽�У�Ŀ�ģ������ⲿ����new�����Ķ���
	private SingleModel()
	{

	}

	public static SingleModel getInstance()
	{
		System.out.println("-----------START------------");
		synchronized (SingleModel.class)
		{
			if (null == sn)
			{
				sn = new SingleModel();
			}
		}
		System.out.println("-----------END------------");
		return sn;
	}

}
