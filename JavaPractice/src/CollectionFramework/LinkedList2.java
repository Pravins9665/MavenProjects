package CollectionFramework;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add("X");
		ll.add("Z");
		ll.add("Y");
		ll.add("C");
		ll.add("A");
		ll.add("B");
		System.out.println("elements of ll are: " + ll);

		LinkedList link1 = new LinkedList();

		// Additional methods of linkedlist
		// 1. addAll()--> Add all elements to new linked list
		link1.addAll(ll);

		System.out.println("elements of link1 are: " + link1);

		// 2. removeAll() --> remove all elements from new linked list
		link1.removeAll(ll);
		System.out.println("after removing elements link1 is: " + link1);

		// 3. sort() --> it will sort element
		System.out.println("before sorting ll is: " + ll);
		Collections.sort(ll);
		System.out.println("after sorting ll is: " + ll);

		// 4. sort(reverse order) -->
		Collections.sort(ll, Collections.reverseOrder());
		System.out.println("after reverse sorting " + ll);

		// 5. Shuffle() --> it will shuffle all the elements
		Collections.shuffle(ll);
		System.out.println("after shuffle : " + ll);
	}

}
