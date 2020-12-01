package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String... strings) {
		List<Shop> list = new ArrayList<Shop>();
		List<Shop> list1 = new ArrayList<Shop>();
		list.add(new Shop(1, "Watch", 100.0));
		list.add(new Shop(3, "Oil", 300.0));
		list.add(new Shop(2, "Mouse", 200.0));

		list1.add(new Shop(1, "Watch", 100.0));
		list1.add(new Shop(3, "Oil", 300.0));
		list1.add(new Shop(2, "Mouse", 200.0));

	
		System.out.println("Using Comparable");
		Collections.sort(list);
		System.out.println(list);

	
		System.out.println("Using Comparator -  Ascending");
		Comparator<Shop> c = new Comparator<Shop>() {
			@Override
			public int compare(Shop o1, Shop o2) {
				return o1.getId() - o2.getId();
			}
		};
		Collections.sort(list1, c);
		System.out.println(list1);

	
		System.out.println("Using Comparator -  Descending");
		Comparator<Shop> c1 = new Comparator<Shop>() {
			@Override
			public int compare(Shop o1, Shop o2) {
				return o2.getId() - o1.getId();
			}
		};
		Collections.sort(list1, c1);
		System.out.println(list1);
	
		System.out.println("Using Comparator function interface and lambda exp -  Aescending -Names");
		Comparator<Shop> c2 = (s1 , s2)-> s1.getName().compareTo(s2.getName());
		Collections.sort(list1,c2);
		System.out.println(list1);
		

				System.out.println("Using Comparator - function interface and lambda exp");
				Collections.sort(list1,(s1,s2)->s2.getName().compareTo(s1.getName()));
				System.out.println(list1);
		
		
		
	}

}
