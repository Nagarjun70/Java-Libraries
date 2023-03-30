package com.jsp.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class mainstudent 
{
	public void addstudent()
	{
		student s1=new student("arjun",12);
		student s2=new student("avhi",13);
		student s3=new student("ajfjk",14);
		
		HashMap<student,Integer> h=new HashMap<student,Integer>();
		
		h.put(s3, 2);
		h.put(s2, 1);
		h.put(s1, 3);

		Set<student> s=h.keySet();
		for(student f:s)
		{
			System.out.println(h.get(f));
		}
		
		
	}

	public static void main(String[] args) 
	{
		mainstudent m=new mainstudent();
		m.addstudent();
	}

}
