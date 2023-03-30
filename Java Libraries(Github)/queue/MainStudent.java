package com.jsp.queue;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;


class pri implements Comparator<student>
{

	@Override
	public int compare(student o1, student o2) {
		// TODO Auto-generated method stub
		return o1.getRank()-o2.getRank();
	}
	
}
public class MainStudent
{
	public void addstudent()
	{
		student s1=new student("arjun",2,98);
		student s2=new student("abhi",3,95);
		student s3=new student("shiva",1,100);
		pri p=new pri();
		PriorityQueue<student> p1=new PriorityQueue<student>(p);
		p1.add(s3);
		p1.add(s2);
		p1.add(s1);
		

		Iterator<student> i1=p1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		
	}

	public static void main(String[] args) 
	{
		MainStudent m1=new MainStudent();
		m1.addstudent();

	}

}
