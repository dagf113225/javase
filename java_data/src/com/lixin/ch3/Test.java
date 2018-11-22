package com.lixin.ch3;

public class Test
{
	
	public static void main(String[] args)
	{
		//java所谓的多维数组，叫做数组中的数组
		
		//java的数组定义1.静态初始化 2.动态初始化
		
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
        
        //动态初始化从数组中的数组，从声明的角度，先有行，再有列
        //声明只有行是能通过编译的，使用的时候都必须有行有列
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
