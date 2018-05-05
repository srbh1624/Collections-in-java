/*Java ArrayList class uses a dynamic array for storing the elements.
 *  It inherits AbstractList class and implements List interface.
 *  The important points about Java ArrayList class are:
 *  Java ArrayList class can contain duplicate elements.
 *  Java ArrayList class maintains insertion order.
 *  Java ArrayList class is non synchronized.
 *  Java ArrayList allows random access because array works at the index basis.
 *  In Java ArrayList class, manipulation is slow because a lot of shifting needs
to be occurred if any element is removed from the array list.

--------------------------------------------------------------------------------
Java ArrayList class extends AbstractList class which implements List interface. 
The List interface extends Collection and Iterable interfaces in hierarchical order.

*/
package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrlist {

	public static void main(String[] args) {
		
		//Default Size of ArrayList is 10.
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0);//Adding object in arraylist  
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		// Iterate only single element prints index value
		System.out.println(1);

		// iterate whole list
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		numbers.remove(0);//Removing object in arraylist
		System.out.println("index"+numbers.lastIndexOf(2));
		System.out.println("index"+numbers.indexOf(3));
		
//		numbers.trimToSize(2);
		// Iterator using for each loop
		for (Integer value : numbers) {
			System.out.println(value);
		}
		
		numbers.clear();//remove all of the elements from this list.
		
		//Traversing list through Iterator  
		  Iterator<Integer> itr=numbers.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  


	}

}
