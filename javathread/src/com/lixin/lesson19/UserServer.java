package com.lixin.lesson19;

public class UserServer
{

	public void receiverClientMsg(Message msgObj, String phone)
	{
		System.out.println("�û�������յ����û����ֻ�����Ϊ:" + phone);

		// ģ���ʱ�����������ѯ���ݿ⣬�������
		try
		{
			Thread.sleep(10000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�û�����˴�����Ϣ���");
		String resultMsg = "�û�,���" + ",����ֻ�����Ϊ:" + phone
				+ ",����Ҫ����Ʒ�Ѿ�����,ʱ��͵ص��Ѿ�ȷ��";

		//�ӿڻص�
		msgObj.notifyMessage(resultMsg);

	}

}
