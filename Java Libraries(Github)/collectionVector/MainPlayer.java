 package com.jsp.collectionVector;
import java.util.Collections;
import java.util.Vector;
public class MainPlayer 
{
	public void addplayer()
	{
		Player p1=new Player("VIRAT",2,10000);
		Player p2=new Player("ABD",1,20000);
		Player p3=new Player("ROHIT",3,14000);
		Player p4=new Player("KL",5,14500);
		Player p5=new Player("DK",4,16000);
		
		Vector<Player> plist=new Vector<Player>();
		plist.add(p5);
		plist.add(p3);
		plist.add(p2);
		plist.add(p1);
		plist.add(p4);
		
		System.out.println(plist);
		
		Collections.sort(plist);
		for(int i=0;i<plist.size();i++)
		{
			System.out.println(plist.get(i));
		}
	}

	public static void main(String[] args) 
	{
		MainPlayer m1=new MainPlayer();
		m1.addplayer();

	}

}
