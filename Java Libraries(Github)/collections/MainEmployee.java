package com.jsp.collections;
import java.util.ArrayList;
import java.util.Collections;
public class MainEmployee
{
	public void addemployee()
	{
		Employee e1=new Employee("name1",101,21000.0);
		Employee e2=new Employee("name2",102,22000.0);
		Employee e3=new Employee("name3",103,23000.0);
		Employee e4=new Employee("name4",104,24000.0);
		
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(e1);
		emplist.add(e4);
		emplist.add(e3);
		emplist.add(e2);
//		System.out.println(emplist);
		Collections.sort(emplist);
		for(int i=0;i<emplist.size();i++)
		{
			System.out.println(emplist.get(i));
		}
	}

	public static void main(String[] args)
	{
		MainEmployee m1=new MainEmployee();
		m1.addemployee();
	}

}
