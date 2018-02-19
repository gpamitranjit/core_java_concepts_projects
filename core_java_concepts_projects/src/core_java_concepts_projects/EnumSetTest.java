package core_java_concepts_projects;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {
	SUNDAY, MONDAY, TUSDAY
}


public class EnumSetTest {

	public static void main(String[] args) {
		Set<days> set = EnumSet.of(days.SUNDAY, days.MONDAY);
		
		Iterator<days> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		System.out.println("===============================");
		Set<days> set2 = EnumSet.allOf(days.class);
		System.out.println("set2: " + set2);
		
		Set<days> set3 = EnumSet.noneOf(days.class);
		
		System.out.println("set3: " + set3);
	}

}
