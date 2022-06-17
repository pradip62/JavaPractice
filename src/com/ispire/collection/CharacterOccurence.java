package com.ispire.collection;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurence {

	public static void main(String[] args) {

		String s = "I am using java";
		char characters[] = s.toCharArray();

		Map<Character, Integer> hm = new HashMap<Character, Integer>();

		for (Character a : characters)   //we can use char also
		{
			if (hm.containsKey(a))
			{
				hm.put(a, hm.get(a) + 1);
			} 
			else
			{
				hm.put(a, 1);
			}
		}

		System.out.println(hm);

	}

}
