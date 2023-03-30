package com.jsp.libraries;

public class StringClass {

	public static void main(String[] args) 
	{
		String str="HELLO";
		String str2="hello";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf('E'));
		System.out.println(str.indexOf('L', 2));
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		System.out.println(str.substring(1,4));

	}

}
