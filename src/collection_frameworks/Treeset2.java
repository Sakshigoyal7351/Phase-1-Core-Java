package collection_frameworks;

import java.util.TreeSet;

class Book2 implements Comparable<Book2>
{
	int id;
	String name;
	int quantity;
	public Book2(int id, String name, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}
	@Override
	public int compareTo(Book2 b) {
		
		if(id>b.id)
		{
			return 1;
		}
		else if(id<b.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}
	
	
	
	
}
public class Treeset2 {

	public static void main(String[] args) {
		
		TreeSet<Book2> s1=  new TreeSet<>();
		
		Book2 b1 = new Book2(101,"let us c",100);
		Book2 b2 = new Book2(102, "Datastructures ",112);
		Book2 b3= new Book2(103,"Operating system ", 50);

		
		s1.add(b1);
		s1.add(b2);
		s1.add(b3);
		
		for(Book2 i: s1)
		{
			System.out.println("book id: "+i.id+"  book name :"+i.name+"  book quantity :"+i.quantity);
		}
		
		
		
		
		
	}

}
