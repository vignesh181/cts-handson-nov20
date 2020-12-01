package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String... args) {
		
		List<Student> list1 = new ArrayList<Student>();
		List<Student> list2 = new ArrayList<Student>();
		
		
		
		list1.add(new Student("Vignesh"));
		list1.add(new Student("Shubham"));
		list2.add(new Student("Ranjeet"));
		list2.add(new Student("Karthik"));
		
		
		Map<String, List> data = new HashMap<String, List>();
		data.put("CS",list1);
		data.put("EC",list2);
		
		
	System.out.println(data);
		
		
		
	}

	

}
