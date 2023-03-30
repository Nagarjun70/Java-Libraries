package com.jsp.libraries;

public class Stringmethods // methods of string class
{
	public static void main(String[] args) 
	{
		String str="arjun";
		String str2="ARJUN";
		System.out.println(str.hashCode());
		System.out.println(str.toString());
		Stringmethods s1=new Stringmethods();
		System.out.println(s1.toString());
		System.out.println(s1.equals(str2));

	}

}
