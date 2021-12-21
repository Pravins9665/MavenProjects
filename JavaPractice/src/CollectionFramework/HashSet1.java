package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {

		HashSet hs = new HashSet();

		// default capacity = 16 & load factor = 0.75
		// We can control capacity & load factor

//		HashSet hs1 = new HashSet(100, 0.75f);   // capacity = 100 & load factor = 0.75

		// 1. add() --> Add elements into hash set

		hs.add("testing");
		hs.add("selenium");
		hs.add(1000);
		hs.add(null);
		hs.add(null);
		hs.add('A');

		System.out.println("elements of hashset is: " + hs);

		// 2. remove() --> it will remove element from set
		hs.remove(null);
		System.out.println("after removing element: " + hs);

		// 3. contains() --> it will check the presence of element in set
		System.out.println(hs.contains("testing"));
		System.out.println(hs.contains("SELENIUM"));

		// 4. isEmpty()
		System.out.println("hashset is empty : " + hs.isEmpty());

		// 5. To retrieve data from hash set

		// using for each loop
		System.out.println("-------------");
		for (Object set : hs) {
			System.out.println(set);
		}

		// using iterator
		System.out.println("-------------");
		Iterator itr = hs.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
