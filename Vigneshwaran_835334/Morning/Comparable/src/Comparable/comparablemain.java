package Comparable;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparablemain {

	public static void main(String... strings) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(10);
		list.add(0);
		list.add(5);
		list.add(4);
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("----Complex List Sorting----");
	
		List<Item> list2 = new ArrayList<Item>();
		list2.add(new Item(1, "Watch" , 1000.0));
		list2.add(new Item(4, "Perfume" , 100.0));
		list2.add(new Item(2, "Mouse" , 2000.0));
		list2.add(new Item(3, "Keyboard" , 500.0));
		
		Collections.sort(list2);
		
		for(int i=0;i<list2.size();i++)
		{
		
			System.out.println(list2.get(i));
		}
		
		
		
		
		
	}
	
	
}
