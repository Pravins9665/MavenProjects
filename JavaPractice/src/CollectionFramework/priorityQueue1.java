package CollectionFramework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue1 {

	public static void main(String[] args) {

		Queue pq = new PriorityQueue();

		/*
		 * 1. add() it will add element into queue if add is not successful then it will
		 * throw 'exception'
		 */
		/*
		 * 2. offer() it will add element into queue if add is not successful then it
		 * will throw null
		 */
		pq.add("postman");
		pq.offer("java");
		pq.add("maven");
		pq.offer("testNG");
		pq.add("Postman");
		pq.add("selenium");

		System.out.println("all the elements of queue is: " + pq);

		/*
		 * 1. element() it will get head element from queue, if it is not successful
		 * then it will throw 'exception'
		 */
		System.out.println("head element of queue is: " + pq.element());
		/*
		 * 2. peek() it will get head element from queue, if it is not successful then
		 * it will throw null
		 */
		System.out.println("head element of queue is: " + pq.peek());

		/*
		 * 1. remove() it will return & remove head element from queue, if it is not
		 * successful then it will throw 'exception'
		 */
		System.out.println("remoed element of queue is: " + pq.remove());
		System.out.println("after removing element: " + pq);
		/*
		 * 1. poll() it will return & remove head element from queue, if it is not
		 * successful then it will throw null
		 */
		System.out.println("remoed element of queue is: " + pq.poll());
		System.out.println("after removing element: " + pq);

		Iterator itr = pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
