package com.czm.ch2;
//byte-->short-->int--->long-->float-->double
public class Test
{
	
	public static void main(String[] args)
	{
		/**
		 * �߳�ͨ��
		 * 1.���߳������̴߳�ֵ
		 * 
		 */  
		
		float  a1=20.09f;
		
		//���߳������̴߳�ֵ
		UserThread  u  =new UserThread(a1);
		u.start();
		
		int  sum=0;
		
		for(int i=0;i<=10;i++)
		{
			sum+=i;
		}
		synchronized (u)
		{
			try
			{
				//�����߳��ڴ�ֻ�����߳�u��������ڴ��������ȴ�
				u.wait();
				
				System.out.println("��Ϊ:"+(sum+u.getSum()));//55+5070
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
