package com.ispire.collection;

import java.util.HashMap;
import java.util.Map;

public class WordOccurence {

	public static void main(String[] args) {
		String s = "i am using java i am using selenium";
		Map<String, Integer> hm = new HashMap();
		String words[] = s.split(" ");

		for (String word : words)
		{
			if (hm.containsKey(word)) 
			{
				hm.put(word, hm.get(word) + 1);
			}
			else
			{
				hm.put(word, 1);
			}
		}
		System.out.println(hm);

	}

}
