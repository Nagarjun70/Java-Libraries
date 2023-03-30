package com.jsp.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSorting {

	public static void main(String[] args) 
	{
		ArrayList<Integer> alist=new ArrayList<Integer>();
		System.out.println(alist);
		alist.add(1);
		alist.add(3);
		alist.add(7);
		alist.add(9);
		alist.add(4);
		alist.add(5);
		System.out.println("before  sorting "+alist);
		Collections.sort(alist);
		System.out.println("after sorting"+alist);
		for(int i=0;i<alist.size();i++)
		{
			System.out.println(alist.get(i));
		}
	}

}
