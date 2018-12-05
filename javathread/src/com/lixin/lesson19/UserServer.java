package com.lixin.lesson19;

public class UserServer
{

	public void receiverClientMsg(Message msgObj, String phone)
	{
		System.out.println("用户服务端收到的用户的手机号码为:" + phone);

		// 模拟耗时操作，比如查询数据库，网络操作
		try
		{
			Thread.sleep(10000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("用户服务端处理消息完毕");
		String resultMsg = "用户,你好" + ",你的手机号码为:" + phone
				+ ",你需要的商品已经到货,时间和地点已经确定";

		//接口回调
		msgObj.notifyMessage(resultMsg);

	}

}
