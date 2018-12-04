package com.lixin.lesson9;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class RunThread extends Thread
{

	int x = 0;

	JLabel lab;
	ImageIcon icon;

	public RunThread(int x, JLabel lab, ImageIcon icon)
	{
		this.x = x;
		this.lab = lab;
		this.icon = icon;
	}

	public  void  run()
	{
		
		while(true)
		{
			x+=5;
			
			//体会线程为什么要sleep
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("x--->"+x);
		
			this.lab.setBounds(x, 40, icon.getIconWidth(), icon.getIconHeight());
		}
		
	}
}
