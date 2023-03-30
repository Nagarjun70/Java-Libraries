package com.jsp.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainHashset 
{
	public void addplayer()
	{
		hashset h1=new hashset("arjun",100,1);
		hashset h2=new hashset("virat",91,4);
		hashset h3=new hashset("abd",85,3);
		hashset h4=new hashset("abhi",90,2);
		
		HashSet<Object> hset=new HashSet<Object>();
		hset.add(h4);
		hset.add(h1);
		hset.add(h3);
		hset.add(h2);
		TreeSet<Object> list=new TreeSet<Object>(hset);

		list.forEach(Obj->System.out.println(Obj));
		
		
		
		
	}

	public static void main(String[] args) 
	{
		MainHashset m1=new MainHashset();
		m1.addplayer();

	}

}
