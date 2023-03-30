package com.jsp.libraries;

public class ObjectClass 
{
	@Override
	public int hashCode()
	{
		return 10;
	}
	@Override
	public String toString()
	{
		return "Arjun";
	}
	@Override
	public boolean equals(Object s)
	{
		return true;
	}

	public static void main(String[] args) 
	{
		ObjectClass o1=new ObjectClass();
		ObjectClass o2=new ObjectClass();
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o1.toString());
		System.out.println(o1.equals(o2));

	}

}
