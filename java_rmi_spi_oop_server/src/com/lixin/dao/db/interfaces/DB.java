package com.lixin.dao.db.interfaces;

import java.util.List;

public interface DB
{

	//����**�������
	public  int getCount(String  tableName);
	
	// ͳ��ѧ��������
	public abstract double getStuMoney(String name);

	// ��ѯ��Ľ��
	public abstract List QueryPageModel(int CurrentPageNum, int pageNum);
}
