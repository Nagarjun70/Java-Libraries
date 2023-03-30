package com.jsp.treeset;
import java.util.*;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class mainPlayer
{
	public void addplayer()
	 {
		player p1=new player("arjun",98,2);
		player p2=new player("arrya",95,1);
		player p3=new player("abhi",99,4);
		player p4=new player("virat",94,3);
		
		TreeSet<player> t1=new TreeSet<player>();
		t1.add(p4);
		t1.add(p3);
		t1.add(p2);
		t1.add(p1);
//		Set<player> t11=new TreeSet<>(t1);
//		System.out.println(t11);
		Iterator<player> t2=t1.iterator();
		while(t2.hasNext())
		{
			System.out.println(t2.next());
		}
		
		
	 }

	public static void main(String[] args) 
	{
		mainPlayer m1=new mainPlayer();
		m1.addplayer();

	}

}
