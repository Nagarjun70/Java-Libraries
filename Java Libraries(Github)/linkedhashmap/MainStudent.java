package com.jsp.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Set;

public class MainStudent 
{
	public void addstudent()
	{
		student s1=new student("arjun",89);
		student s2=new student("kkkk",80);
		student s3=new student("njjj",90);
		
		
		LinkedHashMap<student,Integer> li=new LinkedHashMap<student,Integer>();
		
		li.put(s3, 3);
		li.put(s2, 2);
		li.put(s1, 1);
		
		Set<student>l2=li.keySet();
		
		for(student s:l2)
		{
			System.out.println(s);
		}
	}

	public static void main(String[] args) 
	{
		MainStudent m1=new MainStudent();
				m1.addstudent();

	}

}
