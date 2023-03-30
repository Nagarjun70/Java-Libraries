package com.jsp.collections;

public class Students implements Comparable<Students>
{
	private String name;
	private String usn;
	private int marks;
	public Students(String name, String usn, int marks) 
	{
		super();
		this.name = name;
		this.usn = usn;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", usn=" + usn + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Students o)
	{
		
		return this.marks-o.marks;
	}
	
	
	

}
