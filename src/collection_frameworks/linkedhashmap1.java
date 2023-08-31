package collection_frameworks;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashmap1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> m1 = new LinkedHashMap<>();
		
		m1.put(105, "apple");
		m1.put(102, "banana");
		m1.put(101, "orange");
		m1.put(101, "papaya");
		
		System.out.println(m1);
		
		for(Map.Entry m: m1.entrySet())
		{
			System.out.println(m.getKey()+"    "+m.getValue());
		}
		
		System.out.println("keys: "+m1.keySet());
		System.out.println("value: "+m1.values());
		
		
		m1.remove(101);
		
		System.out.println(m1);
		
		
		
		

	}

}
