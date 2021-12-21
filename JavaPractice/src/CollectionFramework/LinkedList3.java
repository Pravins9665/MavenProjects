package CollectionFramework;

import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {

		LinkedList link = new LinkedList();

		link.add("dog");
		link.add("horse");
		link.add("dog");
		link.add("cat");
		link.add("mouse");

		System.out.println(link);
		
		// Special methods of linked list

		// 1. addFirst() --> it will add element at first
		// 2. addLast() --> it will add element at last
		
		link.addFirst("tiger");
		link.addLast("lion");
		System.out.println("after adding 2 elements: " + link);

		// 3. getFirst()--> it will retrieve first element
		// 4. getLast()--> it will retrieve last element
		
		System.out.println("first element " + link.getFirst());
		System.out.println("last element " + link.getLast());

		// 5. removeFirst()--> it will remove first element
		// 6. removeLast()--> it will remove last element
		
		link.removeFirst();
		link.removeLast();
		System.out.println("after removing first and last element: " + link);

	}

}
