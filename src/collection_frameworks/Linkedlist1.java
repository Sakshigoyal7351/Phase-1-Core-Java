package collection_frameworks;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		
		l1.add(10);
		l1.add(12);
		l1.add(3);
		l1.add(1);
		l1.add(100);
		
		System.out.println(l1);
		
		
		Iterator itr = l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		
		
		for(Integer i:l1)
		{
			System.out.println(i);
		}
		
		l1.add(1,11);
		System.out.println(l1);
		
		l1.remove(4);
		
		System.out.println(l1);
		
		l1.removeFirst();
		System.out.println(l1);
		
		
		l1.removeLast();
		System.out.println(l1);
	}

}
