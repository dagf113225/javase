package com.lixin.lesson26;

public class OracleDB   implements  DB
{
	
	//��ʵ�֣�����û�о���ϸ��ʵ��

	@Override
	public void queryDatas(String msg)
	{
		// TODO Auto-generated method stub
		System.out.println("oracle��ѯ���ݿ�õ�����ϢΪ:"+msg);
	}
	
	private OracleServerOperator  oso;
	
	public  OracleDB(OracleServerOperator  oso)
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
				OracleDB.this.oso.operatorDB(OracleDB.this, s);
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
