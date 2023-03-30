package com.jsp.treemap;

import java.util.Set;
import java.util.TreeMap;

public class Main 
{
	public static void main(String[] args)
	{
		Student s1=new Student("arjun",23);
		Student s2=new Student("abhi",24);
		stu s=new stu();
		
		TreeMap<Student,Integer> t=new TreeMap<Student,Integer>(s);
		t.put( s1,23);
		t.put(s2,24);
		Set<Student> v=t.keySet();
		for(Student i:v)
		{
			System.out.println(i+" ");
		}
		
	}

}
