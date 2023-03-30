package com.jsp.hashmap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


class emp implements Comparable<employe>
{

	@Override
	public int compareTo(employe o) {
		// TODO Auto-generated method stub
		return o.getId()-o.getId();
	}

	
}
public class MainEmploye 
{

	public static void main(String[] args) 
	{
	employe e1=new employe("arjun",101);
	employe e2=new employe("shiva",102);
	employe e3=new employe("abhi",103);
	
	emp e=new emp();
	
	HashMap<employe,Integer> p1=new HashMap<employe,Integer>();
	p1.put(e3,23);
	p1.put(e2,24);
	p1.put(e1,25);
	
	Set<employe> i1=p1.keySet();
	for(employe key:i1)
	{
		System.out.println(key);
	}
	}
	
}
