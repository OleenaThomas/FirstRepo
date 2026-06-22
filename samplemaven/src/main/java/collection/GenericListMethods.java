package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		// Declare interface List variable to store String elements
		List <String> l=new ArrayList <String> ();
		
		// add method
		l.add("apple");
		l.add("orange");
		l.add(null);
		l.add("banana");
		l.add("cherry");
		l.add("banana");
		l.add("grapes");
		System.out.println(l);
		
		// get method
		System.out.println(l.get(2));
		System.out.println(l.get(5));
		
		// set method
		l.set(0, null);
		System.out.println(l);
		
		// contains method
		System.out.println(l.contains("cherry"));
		System.out.println(l.contains("parrot"));
		System.out.println(l.contains(null));
		
		// isEmpty
		System.out.println(l.isEmpty());
		
		// indexOf
		System.out.println(l.indexOf("cherry"));
		System.out.println(l.indexOf("apple"));
		System.out.println(l.indexOf("banana"));
		System.out.println(l.indexOf(null));
		
		// lastIndexOf
		System.out.println(l.lastIndexOf("banana"));
		
		// size
		System.out.println(l.size());
		
		// remove
		l.remove("grapes");
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		
		List <Integer> i=new ArrayList<Integer> ();
		
		// add method
		i.add(25);
		i.add(30);
		i.add(3);
		i.add(35);
		i.add(40);
		System.out.println(i);
		
		// get method
		System.out.println(i.get(3));
		
		// set method
		i.set(4, null);
		System.out.println(i);
		i.set(0, 27);
		System.out.println(i);
		
		// remove
		i.remove(4);
		System.out.println(i);
		
		// size
		System.out.println(i.size());
		
		List <Float> f=new ArrayList <Float>();
		
		// add method
		f.add(7.5f);
		f.add(66.8f);
		f.add(4.7f);
		System.out.println(f);
		
		// indexOf
		System.out.println(f.indexOf(66.8f));
		
		// lastIndexOf
		System.out.println(f.lastIndexOf(7.5f));
		
		// contains
		System.out.println(f.contains(4.7f));
		
		// isEmpty
		System.out.println(f.isEmpty());
	}

}
