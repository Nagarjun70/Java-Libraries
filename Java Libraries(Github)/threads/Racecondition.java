package com.jsp.threads;
//Thread safe class(defining task)
	class Task
	{
		synchronized public void printnumber()
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println(i);
			}
		}
		synchronized public void printnumbers1()
		{
			for(int i=3;i>=1;i--)
			{
				System.out.println(i);
			}
		}
	}
	// creating thread1
	class thread extends Thread
	{
		Task t1;
		public thread(Task t1)
		{
			this.t1=t1;
		}
		@Override
		public void run()
		{
			t1.printnumber();
		
		}
	}
	//creating thread2
	class thread2 extends Thread
	{
		Task t1;
		public thread2(Task t1)
		{
			this.t1=t1;
		}
		@Override
		public void run()
		{
			t1.printnumbers1();
		}
	}
public class Racecondition 
{
	public static void main(String[] args) 
	{
		Task t=new Task();
		thread t1=new thread(t);
		thread2 t2=new thread2(t);
		t1.start();
		t2.start();

	}

}
