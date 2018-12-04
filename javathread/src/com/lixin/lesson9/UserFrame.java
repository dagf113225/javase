package com.lixin.lesson9;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserFrame extends JFrame
{
	private JPanel panel;

	private JLabel lab;
	
	int  x=10;

	ImageIcon icon ;
	public UserFrame()
	{
		panel = new JPanel();
		panel.setLayout(null);

		lab = new JLabel();
		 icon = new ImageIcon("./src/imgs/a.png");
		lab.setIcon(icon);
		lab.setBounds(x, 40, icon.getIconWidth(), icon.getIconHeight());
		panel.add(lab);

		lab.addMouseListener(new MouseClick());

		this.setTitle("°¸Àý");
		this.add(panel);
		this.setSize(1000, 300);
		this.setLocation(300, 100);
		this.setVisible(true);

	}

	public class MouseClick implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e)
		{
			
			// TODO Auto-generated method stub
			System.out.println("------------------mouseClicked");
			RunThread  rt  =new RunThread(x,lab,icon);
			rt.start();
			
		}

		@Override
		public void mousePressed(MouseEvent e)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e)
		{
			// TODO Auto-generated method stub

		}

	}
	
	

	public static void main(String[] args)
	{
		UserFrame uf = new UserFrame();

	}
}
