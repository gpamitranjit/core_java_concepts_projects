package com.amdocs;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

enum myDays {
	MONDAY, TUSDAY, WENSDAY
}

public class EnumMapTest {

	public static void main(String[] args) {
		EnumMap<myDays, String> enumMap = new EnumMap<>(myDays.class);
		
		enumMap.put(myDays.MONDAY, "monday morning blue");
		enumMap.put(myDays.TUSDAY, "tusday coding mode!");
		enumMap.put(myDays.WENSDAY, "boring day!");
		
		Set<Map.Entry<myDays, String>> mapEntrySet = enumMap.entrySet();
		
		for(Map.Entry<myDays, String> mapEntry : mapEntrySet) {
			System.out.println("key:  "+ mapEntry.getKey() + ", value: " + mapEntry.getValue());
		}
		
		
		
	}

}
