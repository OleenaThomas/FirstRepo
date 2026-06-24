package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ForEachClass {

	public static void main(String[] args) {
		int index=0;
		// using array
		int a[]= {10,20,30};
		System.out.println("Iterating array");
		for(int i:a) {
			System.out.println(i);
		}
		
		// using generic list
		List <String> l=new ArrayList<String>();
		l.add("apple");
		l.add("mango");
		l.add("orange");
		System.out.println("Iterating generic list");
		for(String j:l) {
			System.out.println(j);
		}
		
		// using non generic list
		List m=new ArrayList();
		m.add("book");
		m.add("pen");
		m.add("paper");
		System.out.println("Iterating non generic list");
		for(Object j:m) {
			System.out.println(j);
		}
	
		// using generic set
		Set <String> t= new HashSet<String>();
		t.add("TV");
		t.add("AC");
		t.add("DW");
		System.out.println("Iterating generic set");
		for(String k:t) {
			System.out.println(k);
		}
		
		// using non generic set
		Set s=new HashSet();
		s.add("car");
		s.add("bike");
		s.add(11.25f);
		System.out.println("Iterating non generic set");
		for(Object k:s) {
			System.out.println(k);
			if(index==2) {
				System.out.println("Index matched: " +k);
			}
			if(k.equals("car")) {
				System.out.println("Element matched: "+k);
			}
			index++;
		}
		
	}

}
