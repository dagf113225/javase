package com.lixin.aa;

//����ģʽ
public class SingleModel
{
	//����ʽ���� ��-->����Ҫ��ʱ����뵽������
	// ��ʽ���� ��-->�������費��Ҫ���Ҷ�����
	static SingleModel sn;
	
	// �˸� 1.���캯��˽�У�Ŀ�ģ������ⲿ����new�����Ķ���
	private SingleModel()
	{
		
	}
	public static SingleModel getInstance()
	{
		//System.out.println("----------------");
//		synchronized (SingleModel.class)
//		{
			if(null==sn)
			{
				sn=new SingleModel();				
			}
//		}
		
		//System.out.println("---------end---------");
		return sn;		
	}
	
}
