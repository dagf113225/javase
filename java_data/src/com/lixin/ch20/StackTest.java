package com.lixin.ch20;

import java.util.Iterator;
import java.util.Stack;

public class StackTest
{
	public static void main(String[] args)
	{
       Stack  stack = new Stack();
       stack.push(1);
       stack.push(10);
       stack.push(8);
       stack.push(2);
       
//       while(!stack.isEmpty())
//       {
//    	   //³öÕ»²¢ÒÆ³ıÔªËØ
//    	   System.out.println(stack.pop());
//    	
//       }
//        
//       
//       System.out.println("stack-->"+stack);
       
       System.out.println("---------------");
       
     
     // System.out.println(stack.peek());
       System.out.println(stack.pop());
       System.out.println("stack-->"+stack);
	}
}
