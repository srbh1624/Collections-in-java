package collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.charAt(1) - o1.charAt(1) ;
				
			}
		} );
		pq.add("Aman");
		pq.add("Saurabh");
		pq.add("Anam");
//		System.out.println("head:" + pq.element());
//		/* It is used to retrieves, but does not remove, the head of this queue. */
//		System.out.println("head:" + pq.peek());
//		/*
//		 * It is used to retrieves, but does not remove, the head of this queue, or
//		 * returns null if this queue is empty
//		 */
//		System.out.println("remove:" + pq.poll());
//		/*
//		 * It is used to retrieves and removes the head of this queue, or returns null
//		 * if this queue is empty.
//		 */
//		System.out.println("remove:" + pq.remove());
		/*It is used to retrieves and removes the head of this queue.*/
		
//		Iterator<String> itr = pq.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());

	}

}
