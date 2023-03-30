package com.jsp.collectionVector;

public class Player implements Comparable<Player>
{
	private String name;
	private int ranking;
	private int score;
	public Player(String name, int ranking, int score)
	{
		this.name = name;
		this.ranking = ranking;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", ranking=" + ranking + ", score=" + score + "]";
	}
	@Override
	public int compareTo(Player o) {
	
		return this.ranking-o.ranking;
	}
	

}
