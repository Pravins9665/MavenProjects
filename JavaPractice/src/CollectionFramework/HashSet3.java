package CollectionFramework;

import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {

		HashSet<Integer> set1 = new HashSet<Integer>();

		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);

		System.out.println("set1 : " + set1);

		HashSet<Integer> set2 = new HashSet<Integer>();

		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);

		System.out.println("set2 : " + set2);

//		// Union --> it will return unique elements from both sets
//		set1.addAll(set2);
//		System.out.println("union: " + set1);

//		// intersection --> it will return common elements from both sets
//		set1.retainAll(set2);
//		System.out.println("intersection : " + set1);

//		// difference
//		set1.removeAll(set2);
//		System.out.println("difference: "+set1);
		
		//subset --> it verify the set2 is subset is of set1 or not
		System.out.println(set1.containsAll(set2));
		
		
		
		
		
	}

}
