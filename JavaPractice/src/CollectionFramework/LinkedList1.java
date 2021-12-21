package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {

		// Declare linked list
		// To store heterogeneous data
		LinkedList l = new LinkedList();

		// add elements into linked list
		l.add(100);
		l.add("Welcome");
		l.add("to");
		l.add(null);
		l.add(false);

		// To print LinkedList
		
		// 1. By using object of linkedlist
		System.out.println("All the elements of LinkedList: " + l);

//		// 2. Using normal for loop
//		for (int i = 0; i < l.size(); i++) {
//			System.out.println(l.get(i) + " ");
//		}
//		System.out.println("------------------");
//
//		// 3. Using for each loop
//		for (Object element : l) {
//			System.out.println(element + " ");
//		}
//		System.out.println("------------------");
//		
		// 4. Using Lambda expression
		l.forEach(list -> {
			System.out.println(list);
		});
		System.out.println("------------------");
//		
//		// 5. Using Iterator Interface
//		Iterator itr = l.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		System.out.println("------------------");

		// predefined common methods of array list which are also used in linked list

		// 1. size()--> this will return size of linked list
		System.out.println("Size of linkedlist is: "+l.size());
		// 2. remove()--> this will remove element from linked list by passing index or value
		l.remove(2);
		System.out.println("after removing new list: " + l);
		l.remove(false);
		System.out.println("after removing true: " + l);

		//3. add()--> this will add element in the middle somewhere 
		l.add(2, "selenium");
		l.add(4, "java");
		System.out.println("after adding 2 elements : "+l);
		
		//4. get()--> it will retrieve the element as per index passing
		System.out.println(l.get(4));

		//5. set() --> it will replace the element with new as per index passing
		l.set(3, "postman");
		System.out.println(l);
		
		//6. contains() --> it will check the presence of element in linked list
		System.out.println(l.contains("java"));
		
		// 6. isEmpty() --> To verify linked list is empty or not
		System.out.println("l is empty or not: "+l.isEmpty());
		
	}

}
