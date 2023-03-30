package com.jsp.linkedhashset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class addElements 
{
	

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> l1=new LinkedHashSet();
		l1.add(1);
		l1.add(3);
		l1.add(45);
		l1.add(6);
		l1.add(16);
//		l1.add(null);
//		l1.add(null);
//		System.out.println(l1);
		ArrayList<Integer> l2=new ArrayList<Integer>(l1);
		Collections.sort(l2);
		l2.forEach(Obj->System.out.println(Obj));
//		System.out.println(l2);

	}

}
