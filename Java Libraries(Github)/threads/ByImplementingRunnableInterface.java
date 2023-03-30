package com.jsp.threads;

public class ByImplementingRunnableInterface implements Runnable
{
	@Override
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	

	public static void main(String[] args)
	{
		ByImplementingRunnableInterface b1=new ByImplementingRunnableInterface();
		Thread t1=new Thread(b1);
		t1.start();

	}

}
