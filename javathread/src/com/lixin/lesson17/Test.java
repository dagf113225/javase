package com.lixin.lesson17;

public class Test
{

	public static void main(String[] args)
	{
		// ʵ���������˻�
		Bank bank = new Bank("10001", 1000);

		// ΢�ţ�֧��������̨��atm������ͬʱ���������˻�
		UserOperatorThread ut1 = new UserOperatorThread("΢��֮��", bank, 200);
		UserOperatorThread ut2 = new UserOperatorThread("֧����", bank, -800);
		UserOperatorThread ut3 = new UserOperatorThread("��̨", bank, 400);
		UserOperatorThread ut4 = new UserOperatorThread("atm", bank, -500);
		UserOperatorThread ut5 = new UserOperatorThread("����Ǯ��", bank, 600);

		ut1.start();
		ut2.start();
		ut3.start();
		ut4.start();
		ut5.start();

	}

}
