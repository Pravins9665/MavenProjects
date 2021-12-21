package CollectionFramework;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
	
		HashSet<Integer> even = new HashSet<Integer>();
		
		even.add(2);
		even.add(4);
		even.add(6);
		even.add(8);
		
		System.out.println("even Hashset: "+even);
		
		HashSet<Integer> num = new HashSet<Integer>();
		
		// 1. addAll() --> it will add all elements of set to other
		num.addAll(even);
		num.add(10);
		System.out.println("number hashset: "+num);
		
		// 2. removeAll() --> it will remove all elements of set which are similar to other
		num.removeAll(even);
		System.out.println("after removing all, num hashset : "+num);
		
		
		
		
		

	}

}
