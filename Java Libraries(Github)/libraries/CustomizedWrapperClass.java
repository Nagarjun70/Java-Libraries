package com.jsp.libraries;

public class CustomizedWrapperClass
{
		private int i;
	public CustomizedWrapperClass(int i) 
	{
			super();
			this.i = i;
		}

	public int getI() 
	{
		return i;
	}
	public void setI(int i) 
	{
		this.i = i;
	}
	@Override
	public String toString()
	{
		return ""+i;
	}
	public static void main(String[] args) 
	{
		CustomizedWrapperClass c1=new CustomizedWrapperClass(60);
		c1.setI(79);
		System.out.println(c1);

	}

}
