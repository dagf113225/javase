package com.lixin.lesson26;

public class MysqlDB   implements DB
{

	@Override
	public void queryDatas(String msg)
	{
		// TODO Auto-generated method stub
		System.out.println("mysql查询数据库得到的消息为:"+msg);
	}
     private MysqlServerOperator  oso;
	
	public  MysqlDB(MysqlServerOperator  oso)
	{
		this.oso=oso;
	}
	
	
	//回调函数的注册  ,根据**姓名到数据库中查询对应的信息
	public void   registerFuntion( String username)
	{
		System.out.println("开始注册这个回调函数registerFuntion,"+username);
		
		final  String s=username;
		
		//匿名内部类--->基于异步,的目的是，下面的代码可以继续执行
		new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				MysqlDB.this.oso.operatorDB(MysqlDB.this, s);
			}
		}).start();
		
		//OracleDB.this.oso.operatorDB(OracleDB.this, s);
		
		System.out.println("基于回调的查询已经发送...........发送完毕");
		
		
		for(int i=0;i<=100;i++)
		{
			System.out.println(i);
		}
		
	}

}
