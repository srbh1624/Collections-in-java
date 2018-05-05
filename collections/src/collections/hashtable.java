package collections;

import java.util.Hashtable;

public class hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<Integer, String>ht=new Hashtable<Integer, String>();
ht.put(1, "saurabh");
ht.put(2, "srbh");
System.out.println(ht.get(1));
if(ht.contains("srbh"))
	System.out.println(ht.get(2));
	}

}
