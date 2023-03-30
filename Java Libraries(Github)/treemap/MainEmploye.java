package com.jsp.treemap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
class emp implements Comparator<employe>
{

	@Override
	public int compare(employe o1, employe o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
	
}
public class MainEmploye
{
	public void addemploye()
	{
		employe e1=new employe("arjun",101);
		employe e2=new employe("abhi",102);
		employe e3=new employe("shiva",103);
		emp e=new emp();
		TreeMap<employe,Integer> t=new TreeMap<employe,Integer>(e);
		t.put(e3, 3);
		t.put(e2,2);
		t.put(e1, 1);
		
		Set<employe>t1=t.keySet();
		
		for(employe t2:t1)
		{
			System.out.println(t.get(t2));
		}
	}

	public static void main(String[] args) 
	{
		MainEmploye m1=new MainEmploye();
		m1.addemploye();

	}

}
