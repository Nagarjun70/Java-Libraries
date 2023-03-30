package com.jsp.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class example {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "hello");
		map.put(null, null);
		map.put(3, "abcc");
//		System.out.println(map);
//		System.out.println(map.get(2));
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("abcc"));
		Set<Integer> keys=map.keySet();
		for(Integer key:keys)
		{
			System.out.println(key+" "+map.get(key));
		}

	}

}
