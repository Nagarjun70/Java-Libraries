package com.jsp.threads;

public class SleepMethod extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			try {
				SleepMethod.sleep(1000);
			} catch (Exception e) {
			}
		}
			
		
	}

	public static void main(String[] args) 
	{
		SleepMethod s1=new SleepMethod();
		s1.start();
	}

}
