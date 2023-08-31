package collection_frameworks;

import java.util.HashSet;
import java.util.Iterator;

public class hashset1 {

	public static void main(String[] args) {
		HashSet<String> hs1 = new HashSet<>();
		
		hs1.add("sunday");
		hs1.add("monday");
		hs1.add("tuesday");
		hs1.add("sunday");
		
		System.out.println(hs1);
		
		Iterator itr= hs1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(String i:hs1)
		{
			System.out.println(i);
		}
		
//		hs1.remove("monday");
//		System.out.println(hs1);
//		
		
		
		HashSet<String> s1 = new HashSet<>();
		s1.add("wednesday");
		s1.add("friday");
		
		hs1.addAll(s1);
		
		System.out.println(hs1);
		
		
		
	}

}
