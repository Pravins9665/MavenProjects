package CollectionFramework;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTable1 {

	public static void main(String[] args) {
		Hashtable t = new Hashtable();

		t.put(1, "lion");
		t.put(2, "cat");
		t.put(3, "elephant");
		t.put(4, "dog");
		t.put(5, "tiger");
//		t.put(null, "X");
//		t.put(6, null);

		System.out.println(t);

		System.out.println(t.get(4));

		t.remove(4);
		System.out.println("after remove :" + t);

		System.out.println(t.containsKey(2));
		System.out.println(t.containsKey(6));

		System.out.println(t.containsValue("dog"));
		System.out.println(t.containsValue("lion"));

		System.out.println("hashtable is empty: " + t.isEmpty());

		System.out.println(t.keySet()); // return keys as set
		System.out.println(t.values()); // return values as collection
		System.out.println(t.entrySet());// return entries as set

		// return entries using for loop
		for (Object pair : t.keySet()) {
			System.out.println(pair + "  " + t.get(pair));
		}

		// Iterator
		Set set = t.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
