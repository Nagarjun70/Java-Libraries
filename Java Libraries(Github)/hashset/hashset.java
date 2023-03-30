package com.jsp.hashset;

import java.util.TreeSet;

public class hashset implements Comparable<hashset>
{
	private String name;
	private int score;
	private int rank;
	public hashset(String name, int score, int rank) 
	{
		this.name = name;
		this.score = score;
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public int compareTo(hashset o) {
		// TODO Auto-generated method stub
		return this.score-o.score;
	}
	@Override
	public String toString() {
		return "hashset [name=" + name + ", score=" + score + ", rank=" + rank + "]";
	}
	
	

}
