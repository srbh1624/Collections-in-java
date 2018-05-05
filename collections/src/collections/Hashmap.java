package collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(1, "One");
hm.put(2, "Two");
hm.put(3, "Three");
hm.put(4, "Four");

System.out.println(hm.keySet());
System.out.println(hm.entrySet());

for(Map.Entry<Integer,String> entry: hm.entrySet())
{
	System.out.println("Key: "+entry.getKey()+"\tValue: "+entry.getValue());
}
	}

}
