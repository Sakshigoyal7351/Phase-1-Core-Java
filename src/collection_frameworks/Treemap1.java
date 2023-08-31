package collection_frameworks;

import java.util.Map;
import java.util.TreeMap;

public class Treemap1 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> m1= new TreeMap<>();
		
		m1.put(101, "A");
		m1.put(102, "B");
		m1.put(90, "c");
		m1.put(80,"D");
		
		System.out.println(m1);
		
		for(Map.Entry m:m1.entrySet())
		{
			System.out.println(m.getKey()+"   "+m.getValue());
		}
		
		
		
		

	}

}
