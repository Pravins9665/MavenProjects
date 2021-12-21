package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArryaList2 {

	public static void main(String[] args) {

		ArrayList alt = new ArrayList();

		alt.add("X");
		alt.add("Y");
		alt.add("Z");
		alt.add("P");
		alt.add("M");
		alt.add("B");
		System.out.println("elements in arraylist alt is: " + alt);

		ArrayList blt = new ArrayList();
		blt.addAll(alt);
		System.out.println("elements in arraylist blt is: " + blt);

		blt.removeAll(alt);
		System.out.println("After removing arraylist blt : " + blt);

		// sorting an ArrayList
		System.out.println("elements in alt before sorting " + alt);
		Collections.sort(alt);
		System.out.println("elements in alt after sorting " + alt);
		
		Collections.sort(alt, Collections.reverseOrder());
		System.out.println("elements in alt after sorting in reverse order " + alt);

		// shuffling an ArrayList
		Collections.shuffle(alt);
		System.out.println("Elements after shuffling: " + alt);
	}

}
