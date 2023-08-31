package collection_frameworks;

import java.util.LinkedHashSet;

class Book
{
	int id;
	String name;
	int quantity;
	public Book(int id, String name, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}
	
	
	
}


public class linkedhashset2 {

	public static void main(String[] args) {
		
		LinkedHashSet<Book> s1 = new LinkedHashSet<>();
		
		
		Book b1 = new Book(101,"let us c",100);
		Book b2 = new Book(102, "Datastructures ",112);
		Book b3= new Book(103,"Operating system ", 50);
		
		s1.add(b1);
		s1.add(b2);
		s1.add(b3);
		
		
		for(Book i: s1)
		{
			System.out.println("book id: "+i.id+"  book name :"+i.name+"  book quantity :"+i.quantity);
		}
		
		
		
		
		
		
		
		
		

	}

}
