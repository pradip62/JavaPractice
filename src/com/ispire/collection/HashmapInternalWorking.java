package com.ispire.collection;

import java.util.HashMap;
import java.util.Map;

public class HashmapInternalWorking {

	public static void main(String[] args) {
		/*
		 * String s1="FB"; String s2="Ea";
		 * System.out.println(s1.hashCode()+" "+s2.hashCode());// 2236 2236 same
		 * hashcode
		 */     
     Map<String,Integer> hm=new HashMap<>();
     hm.put("aaa", 1);
     hm.put("bbb", 2);
     hm.put(null, 3);
     hm.put(null, 4);
     hm.put("Ea", 5);
     hm.put(null, 6);
     
     for(Map.Entry<String, Integer> m:hm.entrySet())
     {
    	 System.out.println(m.getKey()+" "+m.getValue());
     }
     

	}

}
