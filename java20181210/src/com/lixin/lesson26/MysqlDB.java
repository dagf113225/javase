package com.lixin.lesson26;

public class MysqlDB   implements DB
{

	@Override
	public void queryDatas(String msg)
	{
		// TODO Auto-generated method stub
		System.out.println("mysql��ѯ���ݿ�õ�����ϢΪ:"+msg);
	}
     private MysqlServerOperator  oso;
	
	public  MysqlDB(MysqlServerOperator  oso)
	{
		this.oso=oso;
	}
	
	
	//�ص�������ע��  ,����**���������ݿ��в�ѯ��Ӧ����Ϣ
	public void   registerFuntion( String username)
	{
		System.out.println("��ʼע������ص�����registerFuntion,"+username);
		
		final  String s=username;
		
		//�����ڲ���--->�����첽,��Ŀ���ǣ�����Ĵ�����Լ���ִ��
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
		
		System.out.println("���ڻص��Ĳ�ѯ�Ѿ�����...........�������");
		
		
		for(int i=0;i<=100;i++)
		{
			System.out.println(i);
		}
		
	}

}
