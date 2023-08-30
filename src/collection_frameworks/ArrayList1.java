package collection_frameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import Operators.ternarry_operator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Sakshi");
		list1.add("Mabe");
		list1.add("John");
		list1.add("Justin");
		
		//1 way of printing 
		System.out.println(list1);
		
		//2nd way of printing using iterators 
		Iterator itr = list1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//3rd way of printing using for-each loop
		for(String i:list1)
		{
			System.out.println(i);
		}
		
		
	// access any elementb using get() method 
		
		System.out.println("element ="+list1.get(1));
		
		
		//set the data on giving position 
		
		list1.set(1, "Neo");
		
		System.out.println(list1);
		
		//sort an arraylist
		
		Collections.sort(list1);
		
		
		System.out.println("sorted eleements of list are :"+list1);

	}

}
