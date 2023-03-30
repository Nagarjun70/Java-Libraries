package com.jsp.linkedhashmap;

public class student implements Comparable<student>
{
	private String name;
	private int marks;
	public student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		return this.marks-o.marks;
	}
	
	

}
