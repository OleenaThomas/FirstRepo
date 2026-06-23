package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		Set <String> s=new HashSet <String> ();
		
		s.add("apple");
		s.add("orange");
		s.add("grapes");
		s.add("strawberry");
		s.add(null);
		System.out.println(s);
		
		Set <String> y=new HashSet <String> ();
		y.add("pen");
		y.add("paper");
		
		s.addAll(y);
		System.out.println(s);
		
		System.out.println(s.contains(null));
		System.out.println(s.containsAll(y));
		
		System.out.println(s.size());
		
		System.out.println(s.isEmpty());
		
		//s.clear();
		//System.out.println(s);
		
		s.remove("apple");
		System.out.println(s);
		
		s.removeAll(y);
		System.out.println(s);

		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		i.remove();
		System.out.println(s);
	}

}
