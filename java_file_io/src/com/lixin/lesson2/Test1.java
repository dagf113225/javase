package com.lixin.lesson2;

import java.io.File;

import com.lixin.lesson1.Test;

public class Test1
{
	// �ݹ��㷨���Լ������Լ�
	public void serchFile(File f)
	{
		// f����ļ������ʾ��aa���Ŀ¼
		File[] fs = f.listFiles();
		
		if(null==fs)
		{
			return;
		}

		for (File fa : fs)
		{
			// ������ļ��Ļ�������׺���ʹ�ӡ�ļ���
			if (fa.isFile())
			{
				String fileName = fa.getName();

				System.out.println("�������е��ļ�����Ϊ:" + fileName);
			}
			else
			{
				System.out.println("�����Ŀ¼:" + fa.getName());
				serchFile(fa);// �Լ������Լ�
			}

		}
	}

	public static void main(String[] args)
	{
		// ����aaĿ¼�µ��ļ�
		File f = new File("d://");
		Test t = new Test();
		t.serchFile(f);

	}

}
