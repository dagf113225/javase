package com.lixin.lesson3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 1.5������----------��5���̣߳�ʵ������ֻʹ����2���̣߳�
 * ����������������ͽ�ʡ���̶߳���Ŀ�����
 * 
 * ����ĳصĳ���:
 * 1.���˸�С�Ե꣬ÿ����100�������Է������ʣ���׼�������Ű��?
 * 
 * 50�ŵ��ӣ�������ӿ��Է���ʹ�� �����ӿ��Ը�A--��B--��C������
 * 
 * ����<=�߳�����(�̳߳أ�1,2��)
 * 5������---3���̣߳�������
 * 
 * 
 * @author lenovo
 *
 */
public class Test
{
	public static void main(String[] args)
	{

		// ����һ���̶��̳߳أ����е��߳�������2��
		ExecutorService poolThread = Executors.newFixedThreadPool(2);
		
		for(int  i=0;i<5;i++)
		{
			UserThread  ut = new UserThread();
			
			//���뵽�̳߳���ִ��
			poolThread.execute(ut);
		}
		
		//�ر��̳߳�
		poolThread.shutdown();

	}
}
