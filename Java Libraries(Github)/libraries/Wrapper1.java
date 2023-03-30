package com.jsp.libraries;

public class Wrapper1 {

	public static void main(String[] args)
	{
		int a=10;
		Integer a1=a; //autoboxing
//		Integer a1=Integer.valueOf(a);
		System.out.println("primitive="+a);
		System.out.println("object="+a1);
		
		Integer i1=new Integer(6);//unboxing
		int i2=i1;
		System.out.println("object="+i1);
		System.out.println("primitive="+i2);
	}

}
