package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		// declare an ArrayList1
		ArrayList arr = new ArrayList();

		// Add new elements to the arraylist

		arr.add("Welcome");
		arr.add(1, "To");
		arr.add("Automation");
		arr.add(100);
		arr.add(true);
		arr.add('A');

		// To print all the elements from arraylist

		// 1. direct by using object
		System.out.println("Elements of arraylist are: " + arr);
		System.out.println("------------------");

//		// 2. Using normal for loop
//		for (int i = 0; i < arr.size(); i++) {
//			System.out.println(arr.get(i) + " ");
//		}
//		System.out.println("------------------");
//
//		// 3. Using for each loop
//		for (Object element : arr) {
//			System.out.println(element + " ");
//		}
//		System.out.println("------------------");
//		// 4. Using Lambda expression
//		arr.forEach(list -> {
//			System.out.println(list);
//		});
//		System.out.println("------------------");
//		// 5. Using Iterator Interface
//		Iterator itr = arr.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		System.out.println("------------------");
//		// 6. Using get method
//		System.out.println("element at index 0 is: " + arr.get(0));
//		System.out.println("element at index 1 is: " + arr.get(1));
//		System.out.println("element at index 2 is: " + arr.get(2));
//		System.out.println("element at index 3 is: " + arr.get(3));
//		System.out.println("element at index 4 is: " + arr.get(4));
//		System.out.println("element at index 5 is: " + arr.get(5));
//		System.out.println("------------------");

		// predefined methods in ArrayList & List

		// 1. size()--> this will return size of arraylist
		System.out.println("number of elements in arr arraylist are: " + arr.size());

		// 2. remove() --> this will remove element from arraylist
		arr.remove(5);
		System.out.println("after removing a element arr is: " + arr);

		// 3. get() --> this will return element as per index passing
		System.out.println("value at index 1 is: "+arr.get(1));
		
		// 4. set() --> this will replace element with new value
		arr.set(4, "java");
		System.out.println("after replacing element: "+arr);
		
		// 5. contains() --> it will search the element is present in arraylist or not
		System.out.println("java is present or not: "+arr.contains("java"));
		System.out.println("45 is present or not: "+arr.contains(45));
		
		// 6. isEmpty() --> To verify arraylist is empty or not
		System.out.println("arr is empty or not: "+arr.isEmpty());
	}

}
