package com.lixin.lesson7;

public class   UserThread  extends  Thread
{
     public  void  run() //----3.线程进入到运行状态
     {
    	 System.out.println(Thread.currentThread().getName());
    	 
    	 //4.在线程进入到运行状态对线程的状态的调度
    	 //--1.sleep()  2.yeild() 3.join();
    	 //4.同步  synchronized
    	 
    	 
    	 //5.wait()  notify()  notifyall()
    	 
    	 //1.7  lock锁
    	 //一些新的并发机制
    	 
     }//5.线程死亡
}
