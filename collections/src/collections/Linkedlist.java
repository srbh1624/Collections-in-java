/*Java LinkedList class uses doubly linked list to store the elements.
 *  It provides a linked-list data structure. 
 *  It inherits the AbstractList class and implements List and Deque interfaces.
 *  The important points about Java LinkedList are:
 *  Java LinkedList class can contain duplicate elements.
 *  Java LinkedList class maintains insertion order.
 *  Java LinkedList class is non synchronized.
 *  In Java LinkedList class, manipulation is fast because no shifting needs to be occurred.
 *  Java LinkedList class can be used as list, stack or queue
*/
package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);// Adding object in LinkedList
		list.add(1, 2);
		list.add(3);

		System.out.println(list.get(0));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(1);// Removing object in LinkedList
		
		list.addFirst(0);// Adding object in LinkedList at First
		
		list.addLast(4);// Adding object in LinkedList at Last
		
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
