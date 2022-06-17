package com.ispire.collection;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {

	public static void main(String[] args) {

		Map<String, String> hm = new HashMap<String, String>();
		
		
		hm.put("abc", "qw");
		hm.put("abcd", "qw");
		hm.put("abc", "qw");
		hm.put("abcde", "qw");
		
		System.out.println(hm);
		
		for(Map.Entry<String, String> i:hm.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		
		}
	}
}
