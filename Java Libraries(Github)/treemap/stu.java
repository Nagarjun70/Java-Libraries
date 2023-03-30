package com.jsp.treemap;

import java.util.Comparator;



class stu implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2)
	{
		
//		return o1.getAge()-o2.getAge();
		return o1.getName().compareTo(o2.getName());	
	}
	
}
