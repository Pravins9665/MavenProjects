package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {

		HashMap<Integer, String> m = new HashMap<Integer, String>();

		m.put(101, "java");
		m.put(102, "selenium");
		m.put(103, "testNG");
		m.put(104, "postman");
		m.put(105, "java");
		m.put(106, "automation");
		m.put(106, "manual");

		// printing individual keys using for loop
		for (Object keys : m.keySet()) {
			System.out.println(keys);
		}
		System.out.println("----------");
		// printing individual values using for loop
		for (Object values : m.values()) {
			System.out.println(values);
		}
		System.out.println("----------");
		// printing keys & values together using for loop
		for (Object pair : m.keySet()) {
			System.out.println(pair + "    " + m.get(pair));
		}
		System.out.println("----------");

		// Entry Interface

		for (Map.Entry entry : m.entrySet()) {
			System.out.println(entry.getKey() + "   " + entry.getValue());
		}
		System.out.println("----------");

		// Iterator Interface

		Set s = m.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------");
	}

}
