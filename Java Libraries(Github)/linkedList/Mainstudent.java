package com.jsp.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Mainstudent 
{
	public void addstudent()
	{
		student s1=new student("arjun",98);
		student s2=new student("afffn",94);
		student s3=new student("ahhn",96);

		LinkedList<student> li=new LinkedList<student>();
		li.add(s3);
		li.add(s2);
		li.add(s1);
		
		System.out.println(li);
	Iterator<student>l2=li.iterator();
	while(l2.hasNext())
	{
		System.out.println(l2.next());
	}
	}

	public static void main(String[] args) 
	{
		Mainstudent m1=new Mainstudent();
		m1.addstudent();

	}

}
