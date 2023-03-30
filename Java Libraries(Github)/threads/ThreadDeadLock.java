package com.jsp.threads;
class threadone extends Thread
{
	String s1;
	String s2;
	public threadone(String s1,String s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	@Override
	public void run()
	{
		System.out.println("t1 waiting to lock s1");
		synchronized(s1)
		{
			System.out.println("t1 lock s1");
			System.out.println("t1 waiting to lock s2");
			try {
				System.out.println("t1 pause the execution");
				s1.wait();
				System.out.println("t1 resume the execution");
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			synchronized(s2)
			{
				System.out.println("t1 lock s2");
			}
			System.out.println("t1 unlock s1");
			System.out.println("t1 unlock s2");
		}
	}
}
class threadtwo extends Thread
{
	String s1;
	String s2;
	public threadtwo(String s1,String s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	@Override
	public void run()
	{
		System.out.println("t2 waiting to lock s2");
		synchronized(s2)
		{
			System.out.println("t2 lock s2");
			System.out.println("t2 waiting to lock s1");
			synchronized(s1)
			{
				System.out.println("t2 lock s1");
				s1.notify();
			}
			System.out.println("t2 unlock s2");
			System.out.println("t2 unlock s1");
		}
	}
}

public class ThreadDeadLock {

	public static void main(String[] args) 
	{
		String str="java";
		String str1="sql";
		threadone t1=new threadone(str,str1);
		threadtwo t2=new threadtwo(str,str1);
		t1.start();
		t2.start();
		

	}

}
