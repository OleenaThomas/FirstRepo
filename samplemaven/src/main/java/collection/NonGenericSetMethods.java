package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NonGenericSetMethods {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add(56.75f);
		s.add("bus");
		s.add("train");
		s.add("plane");
		s.add("ship");
		s.add(45);
		s.add(99.88d);
		System.out.println(s);
		
		Set t=new HashSet();
		t.add("lake");
		t.add("mountain");
		t.add("beach");
		
		s.addAll(t);
		System.out.println(s);
		
		System.out.println(s.size());
		
		System.out.println(s.contains("sea"));
		System.out.println(s.containsAll(t));
		
		s.remove("ship");
		System.out.println(s);
		
		s.removeAll(t);
		System.out.println(s);
		
		System.out.println(t.isEmpty());
		
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		i.remove();
		System.out.println(s);
		
		s.clear();
		System.out.println(s);
		
		
		

	}

}
