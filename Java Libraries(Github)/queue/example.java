package com.jsp.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class example {

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> p1=new PriorityQueue<Integer>();
		p1.add(1);
		p1.add(3);
		p1.add(7);
		p1.add(8);
		System.out.println(p1);
		System.out.println(p1.peek());//retirve 1st element
		System.out.println(p1);
		System.out.println(p1.poll()); // remove 1st element
		System.out.println(p1);
		System.out.println(p1.element()); // retrive 1st element
		System.out.println(p1);
		Iterator<Integer> i1=p1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
