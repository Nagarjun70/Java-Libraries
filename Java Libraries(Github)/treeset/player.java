package com.jsp.treeset;

public class player implements Comparable<player>
{
	private String name;
	private int score;
	private int rank;
	public player(String name, int score, int rank) {
		super();
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
	public String toString() {
		return "player [name=" + name + ", score=" + score + ", rank=" + rank + "]";
	}
	@Override
	public int compareTo(player o) {
		// TODO Auto-generated method stub
		return this.rank-o.rank;
	}
	

}
