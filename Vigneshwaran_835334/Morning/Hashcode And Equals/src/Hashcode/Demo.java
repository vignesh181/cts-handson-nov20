package Hashcode;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		
		Set<EmployeeDao> data1  = new HashSet<EmployeeDao>();
		TreeSet<EmployeeDao> data2  = new TreeSet<EmployeeDao>(new Comparator<EmployeeDao>() {

			@Override
			public int compare(EmployeeDao o1, EmployeeDao o2) {
				// TODO Auto-generated method stub
				return o1.getId()-o2.getId();
			}
			
		});		
		LocalTime start = LocalTime.now();
		
		for(int i=0;i<4500;i++)
		{
			
			data2.add(new EmployeeDao(i+100,i));
			
		}
		
		LocalTime end1 = LocalTime.now();
		System.out.println("Time Taken by HashSet : "+Duration.between(start, end1).toMillis());
		
		
LocalTime start1 = LocalTime.now();
		
		for(int i=0;i<4500;i++)
		{
			data1.add(new EmployeeDao(i+100, i));
			
		}
		
		LocalTime end = LocalTime.now();
		
		System.out.println("Time Taken by TreeSet : "+Duration.between(start1, end).toMillis());
		
		
		
		

	}

}