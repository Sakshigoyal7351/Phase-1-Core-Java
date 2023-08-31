package collection_frameworks;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		Set<String> s1 = new LinkedHashSet<>();
		
		s1.add("One");
		s1.add("two");
		s1.add("three");
		s1.add("four");
		s1.add("four");
		
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		for(String i: s1)
		{
			System.out.println(i);
		}
		
		
		s1.remove("two");
		System.out.println(s1);

	}

}
