package collection_frameworks;

import java.util.Iterator;
import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<String>();
		
		v1.add("apple");
		v1.add("banana");
		v1.add("orange");
		
		//add method of vector 
		
		v1.addElement("Dragonfruit");
		v1.add("grapes");
		
		
		
		System.out.println(v1);
		
		
		Iterator itr = v1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		System.out.println();
		
		for(String i : v1)
		{
			System.out.println(i);
		}
		
		v1.removeElementAt(1);
		
		System.out.println(v1);
	}

}
