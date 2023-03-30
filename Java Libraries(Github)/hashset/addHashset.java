package com.jsp.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class addHashset 
{

	public static <T> void main(String[] args) 
	{
		HashSet<Object> h=new HashSet<Object>();
		h.add(1);
		h.add(3);
		h.add(1);
		h.add(45);
		h.add(null);
		h.add(null);
		h.add(666);
		h.add("hii");
	System.out.println(h);
		h.forEach(obj-> System.out.print(obj+" ,"));
		
		

	}

}
