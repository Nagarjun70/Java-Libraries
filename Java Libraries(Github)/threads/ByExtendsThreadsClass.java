package com.jsp.threads;

public class ByExtendsThreadsClass extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
		ByExtendsThreadsClass b1=new ByExtendsThreadsClass();
		b1.start();

	}

}
