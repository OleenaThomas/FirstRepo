package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorClass {

	public static void main(String[] args) {
		Set <String> x=new HashSet <String>();
		x.add("hai");
		x.add("hello");
		x.add("book");
		x.add("pen");
		x.add("hello");
		System.out.println(x);
		
		Iterator i=x.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		i.remove();
		System.out.println(x);
	}

}
