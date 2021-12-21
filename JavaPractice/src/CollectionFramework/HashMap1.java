package CollectionFramework;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// 1. put() --> it will make entry in map
		hm.put(101, "java");
		hm.put(102, "selenium");
		hm.put(103, "testNG");
		hm.put(104, "postman");
		hm.put(105, "java");
		hm.put(106, "automation");
		hm.put(106, "manual");

		System.out.println("entries of hashmap : " + hm);

		// 2. remove() --> it will remove the entry from map
		hm.remove(106);
		System.out.println("after removing entry of hashmap : " + hm);

		hm.remove(105, "java");
		System.out.println("after removing entry of hashmap : " + hm);

		// 3. get() --> it will retrieve value according to key
		System.out.println("value of 102 key is: " + hm.get(102));

		// 4. containskey() --> it will check presence of key in map
		System.out.println(hm.containsKey(101));
		System.out.println(hm.containsKey(107));

		// 5. containsvalue() --> it will check presence of value in map
		System.out.println(hm.containsValue("testNG"));
		System.out.println(hm.containsValue("manual"));

		// 6. isEmpty() --> it will check map is empty or not
		System.out.println("map is empty : " + hm.isEmpty());

		// 7. keySet() --> it will return keys as set
		System.out.println("keys of map are: " + hm.keySet());

		// 8. Values() --> it will return values as collection
		System.out.println("values of map are: " + hm.values());

		// 9. entrySet() --> it will return entries as set
		System.out.println("all entries of map: " + hm.entrySet());

		// 10. replace() --> it will replace the value
		hm.replace(101, "framework");
		System.out.println("updated hashmap is: " + hm);

		hm.replace(104, "postman", "API");
		System.out.println("updated hashmap is: " + hm);

	}

}
