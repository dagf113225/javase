package com.lixin.lesson9;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserView extends JFrame
{
	private JPanel panel;

	private JLabel lab;
	
	private JButton  btn;
	
	int x=100;

	public UserView()
	{
		panel = new JPanel();
		panel.setLayout(null);

		lab = new JLabel();
		lab.setFont(new Font("楷体",Font.BOLD,22));
		lab.setText(x+"");
		lab.setBounds(500, 50, 120, 80);
		panel.add(lab);
		
		btn = new JButton();
		btn.setText("点击");
		btn.setBounds(480, 120, 120, 80);
		panel.add(btn);
		
		//ActionListener
		btn.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("当前线程名字:"+Thread.currentThread().getName());
				// TODO Auto-generated method stub
				MyThread  m1 = new MyThread();
				m1.start();
						
			}
		});

		this.setTitle("案例1");
		this.add(panel);
		this.setSize(1000, 300);
		this.setLocation(300, 100);
		this.setVisible(true);
	}
	
	class  MyThread  extends Thread
	{
		public  void run()
		{
			for(int x=100;x>=0;x--)
			{
				try
				{
					//是当前正在运行的线程 ???
					//当前线程是谁？你搞清楚了吗？
					Thread.sleep(1000);
				}
				catch (InterruptedException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("x-->"+x);
				lab.setText(x+"");
			}
		}
	}

	public static void main(String[] args)
	{
		new UserView();
	}

}
