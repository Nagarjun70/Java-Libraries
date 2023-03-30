package com.jsp.collections;
import java.util.ArrayList;
import java.util.Collections;
public class MainStudents 
{
	public void addstudents()
	{
		Students s1=new Students("arjun","4km18ec006",96);
		Students s2=new Students("abhi","4km18ec007",97);
		Students s3=new Students("arrya","4km18ec008",98);
		Students s4=new Students("ajay","4km18ec009",99);
		
		ArrayList<Students> studlist=new ArrayList<Students>();
		studlist.add(s4);
		studlist.add(s3);
		studlist.add(s2);
		studlist.add(s1);
//		System.out.println(studlist);
		Collections.sort(studlist);
		for(int i=0;i<studlist.size();i++)
		{
			System.out.println(studlist.get(i));
		}
		
		
	}
	

	public static void main(String[] args)
	{
		MainStudents m1=new MainStudents();
		m1.addstudents();

	}

}
