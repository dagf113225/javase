package com.lixin.lesson19;

/**
 * 1.�����û�ȥ�������곤˵û���������ֻ����룬
 * �л�������ͨ���ֻ����뷢��Ϣ������ʱ��͵ص㣬�۸���㡣
 * 
 * �ֻ��������ϻص��ĺ���
 * 
 * �ӿڻص� 1.���ڽӿ�
 * 
 * @author lenovo
 *
 */

public class Test
{
	
	public static void main(String[] args)
	{
		
		UserServer  userver = new UserServer();
		UserClientService  uc = new UserClientService(userver);
		
		//����ע�ắ���ķ�����ע���ֻ�����
		uc.registerUserInfo("13913321086");
	}

}
