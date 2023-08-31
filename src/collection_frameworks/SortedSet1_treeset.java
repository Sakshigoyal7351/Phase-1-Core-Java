package collection_frameworks;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1_treeset {

	public static void main(String[] args) {
		TreeSet<Integer> s1= new TreeSet<>();
		
		s1.add(99);
		s1.add(12);
		s1.add(2);
		s1.add(100);
		s1.add(55);
		
		System.out.println(s1);
		
		Iterator itr= s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		for(Integer i: s1)
		{
			System.out.println(i);
		}
		
		
//		System.out.println("lowest value in my set is : "+s1.pollFirst());
//		System.out.println("highest value in muy set is: "+s1.pollLast());
		
		System.out.println("set in decending order : "+s1.descendingSet());
	}

}
