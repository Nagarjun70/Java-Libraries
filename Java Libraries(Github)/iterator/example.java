package com.jsp.iterator;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class example {

	public static void main(String[] args) 
	{
		Set<Integer> tset=new TreeSet<Integer>();
		tset.add(5);
		tset.add(5);
		tset.add(4);
		tset.add(53);
		tset.add(8);
		tset.add(0);
		System.out.println(tset);
		Iterator i1=tset.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
