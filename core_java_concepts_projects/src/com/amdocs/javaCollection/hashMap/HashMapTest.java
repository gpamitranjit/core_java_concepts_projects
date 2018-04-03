package com.amdocs.javaCollection.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<Key, String> hashMap = new HashMap<>();
		hashMap.put(new Key("12SDFSD1223", "Amit"), "i love java");
		hashMap.put(new Key("SDFSDFQ324234", "Ranjit"), "i love Spring");
		hashMap.put(new Key("SDFSDFw3234234", "Smita"), "i love Spring boot");
		
		System.out.println("size of current hashmap is: " + hashMap.size());
		Set<Map.Entry<Key, String>> set = hashMap.entrySet();
		
		Iterator<Map.Entry<Key, String>> it = set.iterator();
		
		while(it.hasNext()) {
			Entry<Key, String> entry  = it.next();
			System.out.println("key=" + entry.getKey() + ", value=" + entry.getValue());
		}
		
	}

}
