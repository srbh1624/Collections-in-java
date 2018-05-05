package collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Trremap {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String> (new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2.compareTo(o1);
			}
		});
		tm.put(1, "one");
		tm.put(3, "three");
		tm.put(2, "two");
		tm.put(5, "five");
		tm.put(4, "four");
		System.out.println(tm.keySet());
		System.out.println(tm.entrySet());
		for(Map.Entry<Integer, String> m : tm.entrySet()) {
			System.out.println("key:"+m.getKey()+" value:"+m.getValue());
		}
		
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.lowerKey(3));
	}

}
