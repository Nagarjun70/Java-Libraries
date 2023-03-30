package com.jsp.collectionVector;
import java.util.Collections;
import java.util.Vector;
public class AddVector {

	public static void main(String[] args) 
	{
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(12);
		v1.add(10);
		v1.add(45);
		v1.add(12);
		v1.add(34);
		v1.add(50);
		System.out.println("before sorting="+v1);
		Collections.sort(v1);
		System.out.println("after sorting="+v1);
		for(int i=0;i<v1.size();i++)
		{
			System.out.println(v1.get(i));
		}

	}

}
