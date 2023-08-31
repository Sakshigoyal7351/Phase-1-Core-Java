package collection_frameworks;

import java.util.HashMap;
import java.util.Map;

public class hashmap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> m1 = new HashMap<>();
		
		m1.put(1,"Sakshi");
		m1.put(2, "Mabe");
		m1.put(3, "baba");
		m1.put(1,"Sakshi");
		
		
		HashMap<Integer, String> m2 = new HashMap<>();
		
		m2.put(4,"Sakshi2");
		m2.put(5, "Mabe2");
		m2.put(6, "baba2");
		
		System.out.println(m1);
		
		for(Map.Entry m : m1.entrySet())
		{
			System.out.println(m.getKey()+"    "+m.getValue());
		}
		
		m1.putAll(m2);
		
		System.out.println(m1);
		
		m1.remove(5,"Mabe2");
		
		System.out.println(m1);
		
		m1.replace(4,"Simplilearn");
		
		System.out.println(m1);
		
		
		

	}

}
