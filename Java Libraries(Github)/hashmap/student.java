package com.jsp.hashmap;

public class student implements Comparable<student>
{
	private String name;
	private int id;
	public student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + "]";
	}
	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		return this.getId()-o.getId();
	}
	
	

}
