package com.lixin.lesson19;

/**
 * 1.你是用户去买东西，店长说没货，留个手机号码，
 * 有货了我在通过手机号码发消息给具体时间和地点，价格给你。
 * 
 * 手机号码整合回调的核心
 * 
 * 接口回调 1.基于接口
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
		
		//调用注册函数的方法，注册手机号码
		uc.registerUserInfo("13913321086");
	}

}
