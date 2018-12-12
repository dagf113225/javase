package com.lixin.dao.db.interfaces;

import java.util.List;

public interface DB
{

	//基于**表的条数
	public  int getCount(String  tableName);
	
	// 统计学生的收入
	public abstract double getStuMoney(String name);

	// 查询表的结果
	public abstract List QueryPageModel(int CurrentPageNum, int pageNum);
}
