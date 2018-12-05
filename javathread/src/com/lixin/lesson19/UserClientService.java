package com.lixin.lesson19;

//用户服务中心客户端
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
		// 输出什么消息
		System.out.println(msg);

	}

	// 注册回调函数的信息
	public void registerUserInfo(final  String phone)
	{
		System.out.println("在客户服务中心注册的手机号码为:" + phone);

		// 异步回调,异步：1.A---B A继续运行，不需要B执行完毕或者是B返回消息。

		// 启用线程,进行异步
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
		 * 异步执行结果
		 * 在客户服务中心注册的手机号码为:13913321086
在客户服务中心注册的号码发送13913321086,发送成功
用户服务端收到的用户的手机号码为:13913321086
用户服务端处理消息完毕
用户,你好,你的手机号码为:13913321086,你需要的商品已经到货,时间和地点已经确定
		 */
		
		//同步
		UserClientService.this.server.receiverClientMsg(UserClientService.this, phone);
		
		/**
		 * 同步执行结果
		 * 在客户服务中心注册的手机号码为:13913321086
用户服务端收到的用户的手机号码为:13913321086
用户服务端处理消息完毕
用户,你好,你的手机号码为:13913321086,你需要的商品已经到货,时间和地点已经确定
在客户服务中心注册的号码发送13913321086,发送成功
		 */
		//走完上一步，才走这步代码
		System.out.println("在客户服务中心注册的号码发送" + phone + ",发送成功");
	}

}
