package com.lixin.ch5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleDao extends ABstractDB
{

	public OracleDao(String driver, String url, String username, String userpwd)
	{
		super(driver, url, username, userpwd);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String[] getDatas(String sql, Object[] params)
	{
		// TODO Auto-generated method stub
		this.getConnection();
		Connection conn = this.getConn();

		String[] datas = null;

		try
		{
			// oracle的结果集必须设置为可滚动
			PreparedStatement pstmt = conn.prepareStatement(sql,
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);

			if (params.length > 0)
			{
				for (int i = 0; i < params.length; i++)
				{
					pstmt.setObject(i + 1, params[i]);
				}

			}

			ResultSet rs = pstmt.executeQuery();

			int count = 0;

			while (rs.next())
			{
				count++;
			}
			datas = new String[count];

			rs.beforeFirst();

			int row = 0;
			while (rs.next())
			{
				datas[row++] = rs.getString(1);
			}

		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return datas;
	}

}
