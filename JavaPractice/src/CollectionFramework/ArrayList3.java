package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayList3 {

	public static void main(String[] args) {

		String ar[] = { "Dog", "Cat", "Elephant" };
		for (String s : ar)
			System.out.println(s);

		// convert Arrays into ArrayList
		ArrayList list = new ArrayList(Arrays.asList(ar));
		System.out.println("After converting array into ArrayList: " + list);

		// Convert ArrayList to HashSet
		HashSet set = new HashSet(list);
		System.out.println("After converting arraylist to hashset: "+set);
		
		
		
		
		
		
		
		
	}
	

}
