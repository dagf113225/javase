package com.lixin.lesson19;

//�û��������Ŀͻ���
public class UserClientService implements Message
{

	private UserServer server;

	public UserClientService(UserServer server)
	{
		this.server = server;
	}

	@Override
	public void notifyMessage(String msg)
	{
		// TODO Auto-generated method stub
		// ���ʲô��Ϣ
		System.out.println(msg);

	}

	// ע��ص���������Ϣ
	public void registerUserInfo(final  String phone)
	{
		System.out.println("�ڿͻ���������ע����ֻ�����Ϊ:" + phone);

		// �첽�ص�,�첽��1.A---B A�������У�����ҪBִ����ϻ�����B������Ϣ��

		// �����߳�,�����첽
//		new Thread(new Runnable()
//		{
//
//			@Override
//			public void run()
//			{
//				// TODO Auto-generated method stub
//				UserClientService.this.server.receiverClientMsg(
//						UserClientService.this, phone);
//			}
//		}).start();
		/**
		 * �첽ִ�н��
		 * �ڿͻ���������ע����ֻ�����Ϊ:13913321086
�ڿͻ���������ע��ĺ��뷢��13913321086,���ͳɹ�
�û�������յ����û����ֻ�����Ϊ:13913321086
�û�����˴�����Ϣ���
�û�,���,����ֻ�����Ϊ:13913321086,����Ҫ����Ʒ�Ѿ�����,ʱ��͵ص��Ѿ�ȷ��
		 */
		
		//ͬ��
		UserClientService.this.server.receiverClientMsg(UserClientService.this, phone);
		
		/**
		 * ͬ��ִ�н��
		 * �ڿͻ���������ע����ֻ�����Ϊ:13913321086
�û�������յ����û����ֻ�����Ϊ:13913321086
�û�����˴�����Ϣ���
�û�,���,����ֻ�����Ϊ:13913321086,����Ҫ����Ʒ�Ѿ�����,ʱ��͵ص��Ѿ�ȷ��
�ڿͻ���������ע��ĺ��뷢��13913321086,���ͳɹ�
		 */
		//������һ���������ⲽ����
		System.out.println("�ڿͻ���������ע��ĺ��뷢��" + phone + ",���ͳɹ�");
	}

}
