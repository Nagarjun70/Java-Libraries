package com.jsp.linkedhashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainStudent 
{
	public void addstudent()
	{
		student s1=new student("arjun",2,96);
		student s2=new student("arj",1,98);
		student s3=new student("jun",3,92);
		student s4=new student("arju",4,93);
		student s5=new student("rjun",5,91);
		LinkedHashSet<student> l1=new LinkedHashSet<student>();
		l1.add(s5);
		l1.add(s3);
		l1.add(s2);
		l1.add(s1);
		l1.add(s4);
		ArrayList<student> s11=new ArrayList<>(l1);
		Collections.sort(s11);
		System.out.println(s11+" ");
		for(int i=0;i<s11.size();i++)
		{
			System.out.println(s11.get(i));
		}
//		Iterator<student> il=s11.iterator();
		
	}

	public static void main(String[] args)
	{
		MainStudent m1=new MainStudent();
		m1.addstudent();

	}

}
