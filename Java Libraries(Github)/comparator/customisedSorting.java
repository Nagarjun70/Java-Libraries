package com.jsp.comparator;
import java.util.Iterator;
import java.util.Comparator;
import java.util.TreeSet;

class decorder implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		
		return o1.compareTo(o2);
	}
	
}
class lengthorder implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		
		return o1.length()-o2.length();
	}
	
}
public class customisedSorting 
{

	public static void main(String[] args) 
	{
		decorder d1=new decorder();
		lengthorder l1=new lengthorder();
		TreeSet<String> t1=new TreeSet<String>(l1);
		t1.add("Abcdef");
		t1.add("arjun");
		t1.add("h");
		t1.add("abhi");
		t1.add("shivaSS");
		t1.add(" ..............");
		t1.add("nagarajun");
		t1.add("nagarajuni");
		System.out.print(t1);
		
		Iterator t2=t1.iterator();
		while(t2.hasNext())
		{
			System.out.println(t2.next());
		}
		
	}

}
