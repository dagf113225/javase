package com.lixin.ch3;

public class Test
{
	
	public static void main(String[] args)
	{
		//java��ν�Ķ�ά���飬���������е�����
		
		//java�����鶨��1.��̬��ʼ�� 2.��̬��ʼ��
		
		int[][]  arrays ={{1,2,3},{7,8,9},{8,1}};
		
		int[][][]  asys={{{},{}},{{},{}}};
		
        for(int  i=0;i<arrays.length;i++)
        {
        	for(int  j=0;j<arrays[i].length;j++)
        	{
        		System.out.print(arrays[i][j]+",");
        	}
        	System.out.println("");
        }
		 
		/**
		 * 1, 2,  3
		 * 7, 8,   9
		 * 80,100
		 */
        
        //��̬��ʼ���������е����飬�������ĽǶȣ������У�������
        //����ֻ��������ͨ������ģ�ʹ�õ�ʱ�򶼱�����������
        int[][]  vas = new int[3][];
        
        for(int i=0;i<vas.length;i++)
        {
        	for(int  j=0;j<vas[i].length;j++)
        	{
        		System.out.println(vas[i][j]);
        		
        	}
        }
        
        
        
	}

} 
