package com.jsp.treemap;

import java.util.Comparator;

public class employe 
{
	private String name;
	private int id;
	public employe(String name, int id) {
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
		return "employe [name=" + name + ", id=" + id + "]";
	}
	
	

}
