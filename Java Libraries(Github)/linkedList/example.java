package com.jsp.linkedList;

import java.util.LinkedList;

public class example {

	public static void main(String[] args)
	{
		LinkedList<Object> p1=new LinkedList<Object>();
		p1.add(1);
		p1.add(3);
		p1.add(7);
		p1.add(8);
		p1.add(8);
		p1.add(null);
		p1.add(null);
		System.out.println(p1);
		System.out.println(p1.peek());// retirve
		System.out.println(p1);
		System.out.println(p1.poll());//remove
		System.out.println(p1);
		System.out.println(p1.element());
		System.out.println(p1);
		System.out.println(p1.element()); //retirve
		System.out.println(p1);
		System.out.println(p1.get(0));
	}

}
