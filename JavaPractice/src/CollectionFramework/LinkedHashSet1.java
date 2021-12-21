package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
	
//		LinkedHashSet lhs = new LinkedHashSet();
		HashSet lhs = new HashSet();
		
		lhs.add(100);
		lhs.add("java");
		lhs.add(25);
		lhs.add('Z');
		lhs.add("python");
		
		// In LinkedHashSet, insertion order of element preserved
		// In HashSet, insertion order of element not preserved 
		System.out.println("elements of set: "+lhs);
	}

}
