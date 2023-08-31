package collection_frameworks;

import java.util.Map;
import java.util.TreeMap;

class Employee55
{
	int id;
	String name;
	public Employee55(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
public class treemap2 {

	public static void main(String[] args) {
		
		Map<Integer, Employee55> m1 = new TreeMap<>();
		
		Employee55 e1 = new Employee55(101,"ABC");
		Employee55 e2 = new Employee55(102,"XYZ");
		
		
		m1.put(2, e1);
		m1.put(1, e2);
		
		for (Map.Entry<Integer, Employee55> entry : m1.entrySet()) {
			int key = entry.getKey();
			Employee55 val = entry.getValue();
			System.out.println(val.id+"    "+val.name);
		}
		
		
		
		
		
		
		
		
		

	}

}
