package com.lixin.lesson17;

public class Test
{

	public static void main(String[] args)
	{
		// 实例化银行账户
		Bank bank = new Bank("10001", 1000);

		// 微信，支付宝，柜台，atm，京东同时操作银行账户
		UserOperatorThread ut1 = new UserOperatorThread("微信之付", bank, 200);
		UserOperatorThread ut2 = new UserOperatorThread("支付宝", bank, -800);
		UserOperatorThread ut3 = new UserOperatorThread("柜台", bank, 400);
		UserOperatorThread ut4 = new UserOperatorThread("atm", bank, -500);
		UserOperatorThread ut5 = new UserOperatorThread("京东钱包", bank, 600);

		ut1.start();
		ut2.start();
		ut3.start();
		ut4.start();
		ut5.start();

	}

}
