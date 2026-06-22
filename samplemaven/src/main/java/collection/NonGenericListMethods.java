package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethods {

	public static void main(String[] args) {
		List l =new ArrayList();
		
		// add method
		l.add(null);
		l.add("apple");
		l.add(7);
		l.add(4.5f);
		l.add("apple");
		System.out.println(l);
		
		// get method
		System.out.println(l.get(2));
		
		// set method
		l.set(0, 77.8f);
		System.out.println(l);

		// indexOf
		System.out.println(l.indexOf("apple"));
		
		// lastIndexOf
		System.out.println(l.lastIndexOf("apple"));
		
		// contains
		System.out.println(l.contains(8));
		System.out.println(l.contains(77.8f));
		
		// size
		System.out.println(l.size());
		
		// remove
		l.remove("apple");
		System.out.println(l);
		
		// isEmpty
		System.out.println(l.isEmpty());
	}

}
