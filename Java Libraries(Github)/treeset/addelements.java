package com.jsp.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class addelements {

	public static void main(String[] args) 
	{
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(4);
		t1.add(4);
//		t1.add(null);
//		t1.add(null);
		t1.add(56);
		t1.add(23);
		System.out.println(t1);
		Iterator t2=t1.iterator();
		while(t2.hasNext())
		{
			System.out.println(t2.next());
		}
		
		

	}

}
