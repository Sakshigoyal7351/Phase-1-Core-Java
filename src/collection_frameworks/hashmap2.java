package collection_frameworks;

import java.util.HashMap;
import java.util.Map;

class Book5
{
	int id;
	String name;
	int quantity;
	public Book5(int id, String name, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}
	
	
}
public class hashmap2 {

	public static void main(String[] args) {
		
		
		Map<Integer, Book5> m1= new HashMap<>();
		
		Book5 b1= new Book5(101,"java",120);
		Book5 b2= new Book5(102,"python",100);
		Book5 b3= new Book5(103,"C++",111);
		
		m1.put(1, b1);
		m1.put(2, b2);
		m1.put(3, b3);
		
		for(Map.Entry<Integer, Book5>  i:m1.entrySet())
		{
			int key =i.getKey();
			Book5 v=i.getValue();
//			System.out.println(key+"Details");
			System.out.println(v.id+"     "+v.name+"     "+v.quantity);
		}
		

	}

}
