/*Java HashSet class is used to create a collection that uses a hash table for storage. 
 * It inherits the AbstractSet class and implements Set interface.
 * The important points about Java HashSet class are:
 * HashSet stores the elements by using a mechanism called hashing.
 * HashSet contains unique elements only.
 * -----------------------------------------------------------------
 * The HashSet class extends AbstractSet class which implements Set interface. 
 * The Set interface inherits Collection and Iterable interfaces in hierarchical order.
 * */

package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(0);//Adding objects in Hashset
		hs.add(1);
		hs.add(2);
		hs.add(4);
		hs.add(0);
		
		hs.remove(4);//Removing objects in Hashset
		
		Iterator<Integer> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		
	}

}
